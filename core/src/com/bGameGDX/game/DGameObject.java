package com.bGameGDX.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

// Draw-only GameObject e.g. background
public class DGameObject extends GameObject implements Drawable {

	protected Sprite sprite;
	
	public void Draw(SpriteBatch batch) {
		System.out.println("Draw Stuff");

	}

}
