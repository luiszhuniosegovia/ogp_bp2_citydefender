package nl.han.ica.citydefender;

public abstract class AlienWeaponGenerator<W extends AlienWeapon> extends WeaponGenerator {

	private SpaceShip parent;

	public AlienWeaponGenerator(SpaceShip parent) {
		this.parent = parent;
	}
	
	public abstract W generateAlienWeapon();
	
	@Override
	public void generateObject() {
		// TODO Auto-generated method stub
		float x = parent.getCenterX();
		float y = parent.getCenterY();
		W w = generateAlienWeapon();
	}

}
