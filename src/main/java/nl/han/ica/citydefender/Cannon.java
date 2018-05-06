package nl.han.ica.citydefender;


import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.SpriteObject;
import processing.core.PApplet;
import processing.core.PGraphics;

public class Cannon extends SpriteObject {

	private static final float ROTATE_INCREMENT = Settings.CANNON_ROTATE_INCREMENT;
	private boolean firing;
	private int direction;
	private float angle = 0;
	private Sprite cannonSprite;
	private WeaponGenerator gun;
	
	/**
	 * Constructor
	 * @param x X-position in the world
	 * @param y Y-position in the world
	 */
	public Cannon(float x, float y) {
		super(new Sprite("resources/media/PNG/Parts/engine4.png"));
		this.cannonSprite = new Sprite("resources/media/PNG/Parts/gun08.png");
		this.width = this.getImage().width;
		this.height = this.getImage().height + this.cannonSprite.getHeight();
		this.x = (CityDefenderGame.GAMEWIDTH/2) - width/2;
		this.y = (CityDefenderGame.GAMEHEIGHT) - height;
		this.gun = new CannonShellGenerator(this);
	}

	/**
	 * Updates the cannon angle and controls the CannonShellGenerator
	 */
	@Override
	public void update() {
		if (this.direction == LEFT && angle > -80  ) {
			this.angle -= ROTATE_INCREMENT;
		} else if (this.direction == RIGHT && angle < 80) {
			this.angle += ROTATE_INCREMENT;
		}
		
		if (firing) {	
			gun.generateObject();
		}
	}

	/**
	 * Draws the cannon
	 */
	@Override
	public void draw(PGraphics g) {
		try {
			// TODO Auto-generated method stub
			g.fill(66, 33, 44);
			g.image(this.getImage(),x,y+40);
			g.pushMatrix();
			g.translate(getCenterX(), getCenterY());
			g.rotate(PApplet.radians(angle));
			//g.rect(x, y, 10, 40);
			g.image(cannonSprite.getPImage(),-cannonSprite.getWidth()/2,(-cannonSprite.getHeight()/2)-20);
			g.popMatrix();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Determines if keys that control the cannon are pressed
	 */
	@Override
	public void keyPressed(int keyCode, char character) {
		System.out.println("KeyPressed");
		switch (keyCode) {
			case LEFT:
				direction = LEFT;
				System.out.println("Left");
				break;
			case RIGHT:
				direction = RIGHT;
				System.out.println("Right");
				break;
			default:
				if (character == ' ') {
					System.out.println("Fire!");
					firing = true;
				}
		}
	}
	
	/**
	 * Determines of keys that control the cannon are released
	 */
	@Override
	public void keyReleased(int keyCode, char character) {
		switch (keyCode) {
			case LEFT:
			case RIGHT:
				direction = 0;
			default:
				if (character == ' ') {
					firing=false;
				}
		}
	}

	/**
	 * Returns the direction of the cannon barrel
	 * @return current cannon angle
	 */
	public float getCannonDirection() {
		// TODO Auto-generated method stub
		return angle;
	}
}
