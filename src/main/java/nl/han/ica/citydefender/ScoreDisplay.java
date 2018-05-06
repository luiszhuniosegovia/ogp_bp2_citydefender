package nl.han.ica.citydefender;

import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PGraphics;

public class ScoreDisplay extends FontTextObject {


	public ScoreDisplay(String label, int startScore, int fontSize) {
		super(label + startScore, fontSize);
		
				
	}
			public void draw(PGraphics g) {	
			this.x=g.width/2; this.y = g.height/24;
			g.textSize(20);
			g.fill(55, 55,145,255);
			g.textAlign(PConstants.LEFT);
			g.text("Score: "+ CityDefenderGame.score, x, y);		
			
			}
	}
	

