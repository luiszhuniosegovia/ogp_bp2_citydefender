package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public class Cannon extends GameObject {

	public Cannon(float x, float y) {
		this.width = 80;
		this.height = 120;
		this.x = x + 40;
		this.y = y - 120;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(PGraphics g) {
		try {
			// TODO Auto-generated method stub
			g.fill(66, 33, 44);
			g.rect(x - width / 2, y + 40, 80, 80);
			g.pushMatrix();
			g.rotate(HALF_PI);
			g.translate(10, 10);
			g.rect(x - 15, y - 40, 10, 40);
			g.popMatrix();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
