package com.redsparkdev.planetdig.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.redsparkdev.planetdig.PlanetDigMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = PlanetDigMain.V_HEIGHT;
		config.width = PlanetDigMain.V_WIDTH;
		new LwjglApplication(new PlanetDigMain(), config);
	}
}
