package nl.han.ica.citydefender;

public class BombGenerator extends AlienWeaponGenerator<Bomb> {

	public BombGenerator(SpaceShip parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public Bomb generateAlienWeapon() {
		// TODO Auto-generated method stub
		return new Bomb();
	}

}
