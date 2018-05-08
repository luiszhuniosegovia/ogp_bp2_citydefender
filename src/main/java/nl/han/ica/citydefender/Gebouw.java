package nl.han.ica.citydefender;

import java.util.Random;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.SpriteObject;
import processing.core.PGraphics;

public abstract class Gebouw extends SpriteObject {

	public Gebouw(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public abstract void draw(PGraphics g);

	
	public abstract void hit();


}