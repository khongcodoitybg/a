package com.carlosflorencio.bomberman.entities.tile;


import com.carlosflorencio.bomberman.graphics.Sprite;
import com.carlosflorencio.bomberman.entities.Entity;

public class GrassTile extends Tile {

	public GrassTile(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}
	
	@Override
	public boolean collide(Entity e) {
		return true;
	}
}
