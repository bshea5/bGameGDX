package com.bGameGDX.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BGameGDX extends ApplicationAdapter {
	SpriteBatch batch;
	GameWorld g;
	Controller c = new Controller();
	float x,y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		g = new GameWorld();
	}
	
	
	@Override
	// generate outputs
	public void render () {
		//1st clear the screen
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//draw sprites
		batch.begin();
		g.draw(batch);
		batch.end();
		g.update();	

	}
	
}
