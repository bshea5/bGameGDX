package com.bGameGDX.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Arcanist extends Sprite {
	int health = 3;
	String direction = null;
	TextureRegion[] walkRight;
	TextureRegion[] walkLeft;
	TextureRegion[] walkUp;
	TextureRegion[] walkDown;
	boolean isCasting = false;
	
	///////////////////////////////
	// Constructors ///////////////
	public Arcanist() {
		// TODO Auto-generated constructor stub
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
	///////////////////////////////
	// Other Methods //////////////
	public void moveRight() {
    	setDirection("RIGHT");
    	setRegion(0, 36, 32, 36);
    	translateX(100 * Gdx.graphics.getDeltaTime());
	}
	
	public void moveLeft() {
		setDirection("LEFT");
		setRegion(0,108, 32, 36);
		translateX(-100 * Gdx.graphics.getDeltaTime());
	}
	
	public void moveUp() {
    	setDirection("UP");
    	setRegion(0, 0, 32, 36);
    	translateY(100 * Gdx.graphics.getDeltaTime());
	}
	
	public void moveDown() {
    	setDirection("DOWN");
    	setRegion(0, 72, 32, 36);
    	translateY(-100 * Gdx.graphics.getDeltaTime());
	}
	
	public boolean isCasting() {
		return isCasting;
	}
	
	public Sprite cast(String spellName) {
		if (spellName == "FIRETOSS")
			return new Sprite();
		else return null;
	}
	
}
