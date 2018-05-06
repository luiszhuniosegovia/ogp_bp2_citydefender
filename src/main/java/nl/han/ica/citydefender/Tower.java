package nl.han.ica.citydefender;

import processing.core.PGraphics;

public class Tower extends Gebouw {

	@Override
	public void draw(PGraphics g) {
		// TODO Auto-generated method stub
		x=(CityDefenderGame.GAMEWIDTH);
		y=(CityDefenderGame.GAMEHEIGHT)-height;
			
		for(int i =0;i<20;i++) {	
			
			g.pushMatrix();
			g.translate(i*60,y-80);
			g.stroke(0, 50, 200, 100);
	        g.fill(0, 100, 20, 50);
	        g.rect(0,0, 40,80);
			g.popMatrix();
	        
			System.out.println("tower");
		}
	}

	@Override
	public void hit() {
		// TODO Auto-generated method stub

	}

}
