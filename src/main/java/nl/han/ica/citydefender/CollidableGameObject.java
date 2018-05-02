package nl.han.ica.citydefender;

import java.util.List;

import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithGameObjects;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.SpriteObject;

public abstract class CollidableGameObject extends SpriteObject implements ICollidableWithGameObjects {

	/**
	 * Constructor
	 * @param sprite Image to use to draw the object
	 */
	public CollidableGameObject(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public abstract void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects);
	
	@Override
	public void update() {
		if(x+width < 0 || y+height < 0 || x>CityDefenderGame.GAMEWIDTH || y > CityDefenderGame.GAMEHEIGHT) {
			CityDefenderGame.instance().deleteGameObject(this);
			System.out.println("Remove CollidableObject");
		}
	}
}
