package nl.han.ica.citydefender;

import java.util.List;
import java.util.Random;

import nl.han.ica.OOPDProcessingEngineHAN.Logger.DefaultLogger;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.FileLogHandler;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.LogFactory;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.Logger;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.SpriteObject;
import processing.core.PApplet;
import processing.core.PGraphics;

public class SpaceShip extends CollidableGameObject implements IPointValue {

	private static int POINTVALUE = 1;
	private int pointvalue = POINTVALUE;
	
	private WeaponGenerator generator;
	
	/**
	 * Constructor 
	 * @param sprite The image used for the spaceship
	 */
	public SpaceShip(Sprite sprite) {
		super(sprite);
		Random random = new Random();
		
		if(random.nextInt(Settings.MISSILE_CHANCE) == 0) {
		  generator = new MissileGenerator(this);
		} else {
		  generator = new BombGenerator(this);
		}
		 
	}

	@Override
	public void update() {
		super.update();
		System.out.println("Update Spaceship");
		generator.generateObject();
	}
	
	/**
	 * Draw the spaceship
	 */
	@Override
	public void draw(PGraphics g) {
		g.pushMatrix();
		g.translate(getCenterX(), getCenterY());
		g.rotate(PApplet.radians(-this.getDirection()));
		g.image(getImage(), -width / 2, -height / 2);
		g.popMatrix();
	}
	
	/**
	 * TODO: If this spaceship is a kamikaze it might hit a building
	 */
	@Override
	public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
				
	}

	@Override
	public int getPointValue() {
		// TODO Auto-generated method stub
		return pointvalue;
	}

	@Override
	public void setPointValue(int value) {
		this.pointvalue = value;
	}
}
