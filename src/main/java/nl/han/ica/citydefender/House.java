package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

public class House extends Gebouw {

	@Override
	public void draw(PGraphics g) {	

	x=(CityDefenderGame.GAMEWIDTH);
	y=(CityDefenderGame.GAMEHEIGHT)-height;
		for(int i =0;i<20;i++) {	
		
		g.pushMatrix();
		g.translate(i*60,y-60);
		g.stroke(0, 50, 200, 100);
        g.fill(210, 10, 20, 50);
        g.rect(0,0, 40,60);
		g.popMatrix();
        
		//System.out.println("house");
		}
	}

	@Override
	public void hit() {
		
	}
}
	
