package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public abstract class Gebouw extends GameObject {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract void draw(PGraphics g);
	
	public abstract void hit();

}
