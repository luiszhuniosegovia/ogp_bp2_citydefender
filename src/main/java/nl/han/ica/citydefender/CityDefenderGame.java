package nl.han.ica.citydefender;

import java.util.Vector;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.FileLogHandler;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.LogFactory;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.Logger;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;


public class CityDefenderGame extends GameEngine {
	public static final int GAMEWIDTH=1280;
	public static final int GAMEHEIGHT=720;
	private static CityDefenderGame instance;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Vector<IGameObjectGenerator> gameObjectGenerators = new Vector<>();
	static int score;

	public static void main(String[] args) {
		PApplet.main(new String[]{CityDefenderGame.class.getName()});
	}

	public CityDefenderGame( ) {
		this.instance = this;	

	}
	
	@Override
	public void setupGame() {
		
		Logger logger = LogFactory.getLogger();
		logger.addLogHandler(new FileLogHandler());
		
		// TODO Auto-generated method stub
		this.addGameObject(new TitlePopup(this));
		
		this.addGameObject(new ScoreDisplay(sketchPath, score, score));
	
				
		this.gameObjectGenerators.add(new SpaceShipGenerator());
		
		Cannon cannon = new Cannon(GAMEWIDTH/2, GAMEHEIGHT);
		this.addGameObject(cannon);
		createView(GAMEWIDTH,GAMEHEIGHT);
		
		Gebouw tower = new Tower();
		Gebouw house = new House();
		if( house instanceof Gebouw) {
			this.addGameObject(house);
		} else {
			if( tower instanceof Gebouw) {
			this.addGameObject(tower);
			}
		}
		
	}
	
	
	
	private PImage createBackground() {
		PGraphics renderer = createGraphics(GAMEWIDTH, GAMEHEIGHT);
		renderer.beginDraw();
		Sprite s = new Sprite("resources/media/Backgrounds/darkPurple.png");
		PImage p = s.getPImage();
		int countX = (int) Math.ceil(GAMEWIDTH/(float)p.width);
		int countY = (int) Math.ceil(GAMEHEIGHT/(float)p.height);
		for(int x = 0; x<countX; x++) {
			for(int y = 0; y<countY; y++) {
				//renderer.background(255);
				
				renderer.image(p, x*p.width, y*p.height);
			}
		}
		renderer.endDraw();
		return renderer.get();
	}
	


	private void createView(int worldWidth, int worldHeight) {
		
		View view = new View(worldWidth, worldHeight);
		setView(view);
		
		//view.setBackground(28, 0, 69);
		PImage p = createBackground();
		//System.out.println("Image Size: "+p.width+"x"+p.height);
		//System.out.println("View  Size: "+view.getWorldWidth()+"x"+view.getWorldHeight());
		view.setBackground(p);
		size(GAMEWIDTH, GAMEHEIGHT);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		for (IGameObjectGenerator generator : gameObjectGenerators) {
			generator.generateObject();
		}
		score=getScore();
		System.out.println("update score =  "+ score);

	}
	
	public static CityDefenderGame instance() {
		return CityDefenderGame.instance;
	}
	
	public int getScore() {
		//System.out.println("getscore =  "+ score);
		return score;
	}
	
	public void setScore(int score) {
		//System.out.println("setscore =  "+ score);

		this.score = score;
	}
	

	public void addPoints(int pointValue) {
		this.setScore(this.getScore() + pointValue);
		System.out.println("Point = "+ pointValue);

	}

}
