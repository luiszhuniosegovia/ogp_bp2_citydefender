package nl.han.ica.citydefender;

import java.util.List;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.SpriteObject;
import nl.han.ica.citydefender.CollidableGameObject;
import processing.core.PGraphics;

public abstract class AlienWeapon extends CollidableGameObject implements IPointValue {
	private int pointValue = 1;

	/**
	 * AlienWeapon Constructor
	 * 
	 * @param sprite
	 *            Image to use for rendering the weapon
	 */
	public AlienWeapon(Sprite sprite) {
		super(sprite);
	}

	@Override
	public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
		for(GameObject g: collidedGameObjects) {
			if(g instanceof Gebouw) {
				((Gebouw)g).hit();
				System.out.print("hit");
			} 
			
			if(g instanceof Cannon) {
			CityDefenderGame.instance().deleteGameObject(g);
			CityDefenderGame.instance().GameOverPopup();

			System.out.print("Canon hit");
			}
		}
								
	}
	
	
	public int getPointValue() {
		return pointValue;
	}

	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}
}
