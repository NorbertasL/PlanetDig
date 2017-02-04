package com.redsparkdev.planetdig;

import com.badlogic.gdx.Game;
import com.redsparkdev.planetdig.screens.GameScreen;

public class PlanetDigMain extends Game {
	public static final int V_WIDTH = 1280;
	public static final int V_HEIGHT = 720;

	@Override
	public void create () {
		setScreen(new GameScreen(this));
	}

}
