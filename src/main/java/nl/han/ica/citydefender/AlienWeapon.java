package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public class AlienWeapon extends GameObject{

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(PGraphics g) {
		
		Bomb.getBombImg();
		Missile.getMissilImg();
			
		}	
	}
	



