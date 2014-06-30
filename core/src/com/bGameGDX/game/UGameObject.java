package com.bGameGDX.game;

// Update-only GameObject
public class UGameObject extends GameObject implements Updateable {

	public void Update(float deltaTime) {
		System.out.println("update stuff");
	}

}
