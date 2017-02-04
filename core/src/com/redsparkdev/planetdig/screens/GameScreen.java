package com.redsparkdev.planetdig.screens;

import com.badlogic.gdx.Screen;
import com.redsparkdev.planetdig.GameLogic;
import com.redsparkdev.planetdig.GameRenderer;
import com.redsparkdev.planetdig.PlanetDigMain;

/**
 * Created by Red on 01/02/2017.
 * This will be my main game screen
 */
public class GameScreen implements Screen {
    private PlanetDigMain mainClass;
    private GameLogic game;
    private GameRenderer renderer;
    public GameScreen(PlanetDigMain mainClass){
        this.mainClass = mainClass;
        game = new GameLogic();
        renderer = new GameRenderer(game);


    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
