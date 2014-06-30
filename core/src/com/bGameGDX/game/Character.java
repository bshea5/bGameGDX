package com.bGameGDX.game;

public class Character extends DUGameObject {
	
	protected int width, height;	//height and width of sprite to get from texture
	protected int health;

	public Character(String image, int health) {
		super(image);
		this.health = health;
	}

}
