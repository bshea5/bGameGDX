package com.bGameGDX.game;

import java.util.LinkedList; 	//using linked list so that objects
								//can be added and removed
import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GameWorld {
	//list of updateable objects (U's and DU's)
	//private LinkedList<UGameObject> uList;
	//list of drawable objects (D's and DU's)
	//private LinkedList<DGameObject> dList;
	//private DUGameObject player;
	private Arcanist player;
	private Sprite tree;
	private Sprite tree2;
	
	public GameWorld() {
		//uList = new LinkedList<UGameObject>();
		//dList = new LinkedList<DGameObject>();
		// generate game world game objects
		// and add to respective lists
		// first add background, than sprites
		Texture forestSheet = new Texture("Forest_Tileset.png");
		player = new Arcanist(); //use default sprite sheet
		tree = new Sprite(forestSheet, 261, 5, 119, 118);
		tree.setPosition(200, 200);
		tree.setSize(200, 200);
		
		tree2 = new Sprite(forestSheet, 261, 5, 119, 118);
		tree2.setPosition(30, 50);
		tree2.setSize(100, 100);
		
		Texture fireImg = new Texture("Ardentryst-m_fire1_1");
		Sprite fireball = new Sprite(fireImg);
	}
	
	// update game world
	public void update() {
		if (player.isCasting() == false) {
			// player movement
			if( Gdx.input.isKeyPressed(Keys.LEFT) || Gdx.input.isKeyPressed(Keys.A) ) { 
				player.moveLeft();
			}
			else if(Gdx.input.isKeyPressed(Keys.RIGHT) ||  Gdx.input.isKeyPressed(Keys.D)) {
		    	player.moveRight();
		    }
			else if(Gdx.input.isKeyPressed(Keys.UP) ||  Gdx.input.isKeyPressed(Keys.W)) {
		    	player.moveUp();
		    }
			else if(Gdx.input.isKeyPressed(Keys.DOWN) ||  Gdx.input.isKeyPressed(Keys.S)) {
		    	player.moveDown();
		    }
		}
		if ( Gdx.input.isKeyPressed(Keys.F) ) {
			
		}
	}
	
	public void draw(SpriteBatch batch) {
		tree.draw(batch);
		tree2.draw(batch);
		player.draw(batch);
	}
	
}
