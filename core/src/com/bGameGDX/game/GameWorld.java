package com.bGameGDX.game;

import java.util.LinkedList; 	//using linked list so that objects
								//can be added and removed
import java.util.Iterator;

public class GameWorld {
	//list of updateable objects (U's and DU's)
	private LinkedList<UGameObject> uList;
	//list of drawable objects (D's and DU's)
	private LinkedList<DGameObject> dList;
	
	public GameWorld() {
		uList = new LinkedList<UGameObject>();
		dList = new LinkedList<DGameObject>();
		// generate game world game objects
		// and add to respective lists
		// first add background, than sprites
	}
}
