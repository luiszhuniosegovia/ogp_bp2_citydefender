package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PImage;

public class Bomb extends Sprite{
	private final static String bombImg= "resources/media/PNG/Lasers/Laser2.png";

	public Bomb(PImage image) {
		super(image);
			
	}
	
	public static String getBombImg() {
		return bombImg;
	}

}
