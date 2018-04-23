package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PGraphics;

public class TitlePopup extends GameObject {

	private PApplet applet;

	public TitlePopup(PApplet applet) {
		this.applet = applet;
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public void draw(PGraphics g) {
		PFont f = applet.createFont("resources/fonts/kenvector_future.ttf", 50);
		this.x=g.width/2; this.y = g.height/2;
		g.textFont(f, 80);
		
		g.fill(55, 55,145,255);
		g.textAlign(PConstants.CENTER,PConstants.BASELINE);
		g.text("City Defender", x, y);
		g.textSize(40);
		g.text("<Press space to start>", x, y+80);
		
	}

}
