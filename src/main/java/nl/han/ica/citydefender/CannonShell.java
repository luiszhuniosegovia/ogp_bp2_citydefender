package nl.han.ica.citydefender;

import java.util.List;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;
import processing.core.PGraphics;

public class CannonShell extends CollidableGameObject {
	public CannonShell() {	
		super(new Sprite("resources/media/PNG/Lasers/laserBlue01.png"));
		// TODO Auto-generated constructor stub
	}

	/**
	 * Determines if the bullet hit an object that's worth points and removes itself and the collided object
	 * and adds the point value to the player score;
	 */
	@Override
	public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
		// TODO Auto-generated method stub
		for(GameObject o: collidedGameObjects) {
			if (o instanceof IPointValue) {
				System.out.println("Hit game object of type IPointValue");
				CityDefenderGame.instance().addPoints(((IPointValue)o).getPointValue());
				CityDefenderGame.instance().deleteGameObject(o);
				CityDefenderGame.instance().deleteGameObject(this);
			}
		}

	}
	
	/** 
	 * Tekent de kogel op het scherm. De draaiing van de kogel is afhankelijk van de richting;
	 */
	@Override
	public void draw(PGraphics p) {
		p.pushMatrix();
		p.translate(getCenterX(), getCenterY());
        p.rotate(PApplet.radians(getDirection()));
        p.image(getImage(), -width / 2, -height / 2);
		p.popMatrix();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
