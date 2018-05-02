package nl.han.ica.citydefender;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;


public abstract class Missile extends GameObject{
	private final static String missilImg= "resources/media/PNG/Lasers/Laser1.png";
	private final int MISSILE_SPEED=2;
	private boolean visible;
	
    public Missile(float xPosition, float yPosition) {
    
    	this.visible= isVisible();
    	this.x=xPosition;
    	this.y=yPosition;
    	  	
    }
     
  
public static String getMissilImg() {
	return missilImg;
	
}
public void move() {
	y+=MISSILE_SPEED;
	if (y>(CityDefenderGame.GAMEHEIGHT )) {
		visible=false;
	}
			
	
}
    
}