package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PApplet;
import processing.core.PGraphics;

public class Missile extends AlienWeapon {
	private final static String missilImg = "resources/media/PNG/Lasers/laserRed01.png";
	private final float MISSILE_SPEED = Settings.MISSILE_SPEED;

	public Missile() {
		super(new Sprite(missilImg));
		this.setSpeed(MISSILE_SPEED);
		
	}

	@Override
	public void update() {
		super.update();
		float direction = this.getAngleFrom(Settings.GAMEWIDTH/2, Settings.GAMEHEIGHT-40);
		this.setDirection(direction);
	}
	
	/** 
	 * Tekent de kogel op het scherm. De draaiing van de kogel is afhankelijk van de richting;
	 */
	@Override
	public void draw(PGraphics p) {
		p.pushMatrix();
		p.translate(getCenterX(), getCenterY());
        p.rotate(PApplet.radians(getDirection()));
        p.image(getImage(), -width / 2, -height / 2);
		p.popMatrix();
	}
}