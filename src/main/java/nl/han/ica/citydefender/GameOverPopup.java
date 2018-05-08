package nl.han.ica.citydefender;

import processing.core.PConstants;
import processing.core.PGraphics;

public class GameOverPopup extends FontTextObject {
int score=CityDefenderGame.score ;
int x1 =10;
int y2=10;

	public GameOverPopup(String text, int fontSize) {
		super(text, fontSize);
		// TODO Auto-generated constructor stub
	
	}


	public void draw(PGraphics g) {	

	this.x=g.width/2; this.y = g.height/2;
	g.background(0, 51, 128);
	/**for(int i=0;i<200;i++) {
	g.fill(255);
	g.ellipse(i*x1,i*y2, 2, 2);}*/
	g.textSize(80);
	g.fill(255, 51, 0);
	g.textAlign(PConstants.CENTER);
	g.text("GAME OVER ! ", x, y);
	g.textSize(40);
	g.text("Your Score is:  " + score, x, y+150);		

	
	}

	
	
	
	
}




