package com.BryanBecerra;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player {

    private Texture texture;
    private float x;
    private float y;
    private float speed = 200;
    private int points;
    
    public Player() {
        texture = new Texture("fox.png"); // must be in core/assets/
        x = 200;
        y = 200;
        points = 0;
        
    }

    public void update(float dt) {
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            y += speed * dt;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            y -= speed * dt;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            x -= speed * dt;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            x += speed * dt;
        }
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, x, y);
    }
    
    
    public String getPoints() {
        return String.valueOf(points);
    }

    public void dispose() {
        texture.dispose();
    }
}
