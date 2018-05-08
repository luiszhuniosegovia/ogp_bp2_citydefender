package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import processing.core.PGraphics;

public class Tower extends Gebouw {
	private final static String towerImg = "resources/media/PNG/Gebouwen/Tower03a.png";

	public Tower() {
		super(new Sprite (towerImg));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(PGraphics g) {

		x=(CityDefenderGame.GAMEWIDTH);
		y=(CityDefenderGame.GAMEHEIGHT)-height;

		g.image(getImage(), 0,y);
}
		

	@Override
	public void hit() {
		
		if (towerImg != null) {
			
			CityDefenderGame.instance().deleteGameObject(this);
			} 
		
	}

}
