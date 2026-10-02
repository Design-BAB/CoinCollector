package com.BryanBecerra;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;

public class Main extends ApplicationAdapter {

    private SpriteBatch batch;
    private BitmapFont font;
    private Player fox;
    private Coin coin;
    
    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // default font
        fox = new Player();
        coin = new Coin();
    }

    @Override
    public void render() {
        float dt = Gdx.graphics.getDeltaTime();
        fox.update(dt);
        ScreenUtils.clear(19f/255, 171f/255, 85f/255, 1); // black background
        batch.begin();
        font.draw(batch, fox.getPoints(), 100, 100);
        fox.draw(batch);
        coin.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
        fox.dispose();
        coin.dispose();
    }
}
