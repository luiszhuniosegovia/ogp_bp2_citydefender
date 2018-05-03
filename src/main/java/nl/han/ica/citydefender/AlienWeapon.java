package nl.han.ica.citydefender;


import java.util.List;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.citydefender.CollidableGameObject;



public abstract class AlienWeapon extends CollidableGameObject {

	/**
	 * AlienWeapon Constructor
	 * @param sprite Image to use for rendering the weapon
	 */
	public AlienWeapon(Sprite sprite) {
		super(sprite);
	}

	@Override
	public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
		// TODO Check for hitting a building
	}

}

