package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

public class House extends Gebouw {
	private final static String houseImg = "resources/media/PNG/Gebouwen/House02.png";

	public House() {
		super(new Sprite (houseImg));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(PGraphics g) {	

	x= 50;  //(CityDefenderGame.GAMEWIDTH);
	y=(CityDefenderGame.GAMEHEIGHT)-height;
	
	g.image(getImage(), x, y);
		
	}

	
	@Override
	public void hit() {
		
	}
}
	
