package nl.han.ica.citydefender;

import java.util.Vector;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.FileLogHandler;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.LogFactory;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.Logger;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.SpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;

public class CityDefenderGame extends GameEngine {
	public static final int GAMEWIDTH=1280;
	public static final int GAMEHEIGHT=720;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Vector<IGameObjectGenerator> gameObjectGenerators = new Vector<>();

	public static void main(String[] args) {
		PApplet.main(new String[]{CityDefenderGame.class.getName()});
	}

	@Override
	public void setupGame() {
		Logger logger = LogFactory.getLogger();
		logger.addLogHandler(new FileLogHandler());
		int worldWidth = 1204;
		int worldHeight = 903;
		// TODO Auto-generated method stub
		this.addGameObject(new TitlePopup(this));
		
		SpriteObject s = new SpaceShip(new Sprite("resources/media/PNG/Enemies/enemyBlack5.png"));
			
		s.setX(0);
		s.setY(100);
		s.setxSpeed(5);
		this.addGameObject(s);
		
		Cannon cannon = new Cannon(GAMEWIDTH/2, GAMEHEIGHT);
		this.addGameObject(cannon);
		createView(GAMEWIDTH,GAMEHEIGHT);


	}

	private void createView(int worldWidth, int worldHeight) {
		View view = new View(worldWidth, worldHeight);
		setView(view);
		view.setBackground(28, 0, 69);
		size(worldWidth, worldHeight);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		for (IGameObjectGenerator generator : gameObjectGenerators) {
			generator.generateObject();
		}

	}
}
