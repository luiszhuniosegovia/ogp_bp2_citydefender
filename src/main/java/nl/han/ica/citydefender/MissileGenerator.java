package nl.han.ica.citydefender;

public class MissileGenerator extends AlienWeaponGenerator<Missile> {

	public MissileGenerator(SpaceShip parent) {
		super(parent);
		
	}

	@Override
	public Missile generateAlienWeapon() {
		// TODO Auto-generated method stub
		return new Missile();
	}

}
