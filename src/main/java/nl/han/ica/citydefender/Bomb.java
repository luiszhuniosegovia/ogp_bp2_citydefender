package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

public class Bomb extends AlienWeapon {
	private final static String bombImg= "resources/media/PNG/Lasers/laserRed08.png";

	
	public Bomb() {
		super(new Sprite(bombImg));		
	}

}
