package com.bGameGDX.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Arcanist extends Sprite {
	int health = 3;
	int x,y;
	String direction = null;
	TextureRegion[][] walkAnimation;
	boolean casting = false;
	
	///////////////////////////////
	// Constructors ///////////////
	public Arcanist() {
		//default player avatar constructor
		super(new Texture("mage_f.png"), 0, 0, 32, 36);
		walkAnimation = split(this.getTexture(), 32,36);
	}

	public Arcanist(Texture texture) {
		super(texture);
		// TODO Auto-generated constructor stub
	}

	public Arcanist(TextureRegion region) {
		super(region);
		// TODO Auto-generated constructor stub
	}

	public Arcanist(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}

	public Arcanist(Texture texture, int srcWidth, int srcHeight) {
		super(texture, srcWidth, srcHeight);
		// TODO Auto-generated constructor stub
	}

	public Arcanist(Texture texture, int srcX, int srcY, int srcWidth,
			int srcHeight) {
		super(texture, srcX, srcY, srcWidth, srcHeight);
		// TODO Auto-generated constructor stub
	}

	public Arcanist(TextureRegion region, int srcX, int srcY, int srcWidth,
			int srcHeight) {
		super(region, srcX, srcY, srcWidth, srcHeight);
		// TODO Auto-generated constructor stub
	}
	// End Constructors ///////////
	///////////////////////////////
	
	///////////////////////////////
	// Getters/Setters ////////////
	public void setDirection(String s) {
		direction = s;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	
	public int getHealth() {
		return health;
	}
	
	////////////////////////////////
	// movement methods ////////////
	public void moveRight() {
		if ( (getDirection() != "RIGHT") || (y >= 2) ) {
			x = 1; y = 0;
	    	setDirection("RIGHT");
	    	setRegion(walkAnimation[x][y]);
		}
		else {
			y++;
			setRegion(walkAnimation[x][y]);
		}
		translateX(100 * Gdx.graphics.getDeltaTime());
	}
	
	public void moveLeft() {
		if ( (getDirection() != "LEFT") || (y >= 2) ) {
			x = 3; y = 0;
			setDirection("LEFT");
			setRegion(walkAnimation[x][y]);
		}
		else {
			y++;
			setRegion(walkAnimation[x][y]);
		}
		translateX(-100 * Gdx.graphics.getDeltaTime());
	}
	
	public void moveUp() {
		if ( (getDirection() != "UP") || (y >= 2) ) {
	    	x = 0; y = 0;
			setDirection("UP");
	    	setRegion(walkAnimation[x][y]);
		}
		else {
			y++;
			setRegion(walkAnimation[x][y]);
		}
    	translateY(100 * Gdx.graphics.getDeltaTime());
	}
	
	public void moveDown() {
		if ( (getDirection() != "DOWN") || (y >= 2) ) {
	    	x = 2; y = 0;
			setDirection("DOWN");
	    	setRegion(walkAnimation[x][y]);
		}
		else {
			y++;
			setRegion(walkAnimation[x][y]);
		}
    	translateY(-100 * Gdx.graphics.getDeltaTime());
	}
	
	///////////////////////////////
	// Other Methods //////////////
	public boolean isCasting() {
		return casting;
	}
	
	public Sprite cast(String spellName) {
		casting = true;
		
		if (spellName == "FIRETOSS")
			return new Sprite();
		else return null;
	}
	
}
