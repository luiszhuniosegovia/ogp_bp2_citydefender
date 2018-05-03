package nl.han.ica.citydefender;

public class CannonShellGenerator extends WeaponGenerator {
	private static final float SPEED = Settings.BULLET_SPEED;
	private static final int RATE = Settings.CANNON_FIRE_RATE;
	private int counter = 0;
	private boolean firing;
	private Cannon cannon;

	public CannonShellGenerator(Cannon cannon) {
		this.cannon = cannon;
	}

	@Override
	public void generateObject() {
		if (counter == 0) {
			CannonShell c = new CannonShell();
			float x = cannon.getCenterX()-4;
			float y = cannon.getCenterY()-40;
			float direction = cannon.getCannonDirection();
			float speed = SPEED;
			c.setDirectionSpeed(direction, speed);
			CityDefenderGame.instance().addGameObject(c, x, y, 2f);
			counter++;
		} else if (counter >= RATE) {
			counter = 0;
		} else {
			counter++;
		}
	}

	public boolean isFiring() {
		return firing;
	}

	public void setFiring(boolean firing) {
		this.firing = firing;
	}

}
