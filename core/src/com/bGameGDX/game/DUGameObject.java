package com.bGameGDX.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

// Update and Draw GameObject
public class DUGameObject extends UGameObject implements Drawable {
	//inherited overloaded update() , use that or overload again?
	//overload draw()
	
	protected Sprite sprite;			// get a sprite from the image file
	//float posX, posY;					// x, y positions
	//int drawOrder;					// order in which it is drawn
	
	public DUGameObject(String image) {
		//spriteSheet = new Texture(image);
		sprite = new Sprite(new Texture(image), 0, 0, 0, 0);  // default sprite is nothing
	}
	
	// draw the sprite
	public void Draw(SpriteBatch batch) {
		sprite.draw(batch);
	}
	
	public void Update(float deltaTime) {
		System.out.println("Update stuff");
	}
	
	// set a different region of the texture to sprite
	public void setSprite(int x, int y, int width, int height) {

	}
	
	// change the position of the sprite ---------
	public void setX(float x) {
		sprite.setX(x);
	}
	
	public void setY(float y) {
		sprite.setY(y);
	}
	
	public float getX() {
		return sprite.getX();
	}
	
	public float getY() {
		return sprite.getY();
	}
	// ------------------------------------------
}
