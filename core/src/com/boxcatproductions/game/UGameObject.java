package com.boxcatproductions.game;

// Update-only GameObject
public class UGameObject extends GameObject implements Updateable {

	public void update(float deltaTime) {
		System.out.println("update stuff");
	}

}
