package com.BryanBecerra;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;

public class Coin {
    private Texture texture;
    private float x;
    private float y;
    
    public Coin() {
        texture = new Texture("coin.png"); // must be in core/assets/
        x = 300;
        y = 300;
    }
    
    public void draw (SpriteBatch batch) {
        batch.draw(texture, x, y);
    }

    public void dispose() {
        texture.dispose();
    }
}
