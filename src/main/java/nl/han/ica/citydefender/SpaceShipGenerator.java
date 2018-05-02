package nl.han.ica.citydefender;

import java.util.Random;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

public class SpaceShipGenerator implements IGameObjectGenerator {
	private static int RATE = Settings.SPACESHIP_RATE;
	private static Random random = new Random();
	
	
	@Override
	public void generateObject() {
		//System.out.println("Generate spaceship?");
		if(random.nextInt(RATE)==0) {
			// Left = false
			// Right = true
			boolean leftOrRight = random.nextBoolean();
			int direction = (leftOrRight?90:-90);
			int x = leftOrRight?0:CityDefenderGame.GAMEWIDTH;
			SpaceShip s = new SpaceShip(new Sprite("resources/media/PNG/Enemies/enemyBlue1.png"));
			float speed = Settings.SPACESHIP_SPEED;
			s.setDirectionSpeed(direction, speed );
			CityDefenderGame.instance().addGameObject(s, x, random.nextInt(150)+50);
		}
		// TODO Auto-generated method stub
		
	}

}
