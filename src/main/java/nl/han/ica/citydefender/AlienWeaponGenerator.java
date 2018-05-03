package nl.han.ica.citydefender;

import java.util.Random;

public abstract class AlienWeaponGenerator<W extends AlienWeapon> extends WeaponGenerator {

	private SpaceShip parent;
	private static Random random = new Random();

	public AlienWeaponGenerator(SpaceShip parent) {
		this.parent = parent;
	}

	public abstract W generateAlienWeapon();

	@Override
	public void generateObject() {
		if (random.nextInt(Settings.ALIENWEAPON_RATE) == 0) {
			// System.out.println("Generate Weapon");
			float x = parent.getCenterX();
			float y = parent.getCenterY();
			W w = generateAlienWeapon();
			CityDefenderGame.instance().addGameObject(w, x, y);
			w.setSpeed(1.4f);
			w.setDirection(180f);
		}
	}

}
