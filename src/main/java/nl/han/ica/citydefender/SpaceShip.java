package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Logger.DefaultLogger;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.FileLogHandler;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.LogFactory;
import nl.han.ica.OOPDProcessingEngineHAN.Logger.Logger;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.SpriteObject;
import processing.core.PGraphics;

public class SpaceShip extends SpriteObject {

	public SpaceShip(Sprite sprite) {
		
		super(sprite);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		Logger logger = LogFactory.getLogger();
		
		// TODO Auto-generated method stub
		//logger.logln(1, "Update spaceship"+width+height);
		

	}
}
