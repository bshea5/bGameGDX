package com.bGameGDX.game;

import java.awt.image.BufferedImage;;

public class Sprite extends DUGameObject {

	BufferedImage image;
	int drawOrder;
	int x, y;
	
	public Sprite(BufferedImage image, int drawOrder, int x, int y) {
		this.image = image;
		this.drawOrder = drawOrder;
		this.x = x;
		this.y = y;
	}
	
	public void Draw() {
		// draw image @ the correct x,y
	}

}
