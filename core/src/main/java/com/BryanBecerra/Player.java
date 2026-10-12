package com.BryanBecerra;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player extends GameObj {

    private float speed = 400;
    public int points;

    public Player() {
        super("fox.png", 200, 200); // initialize texture + bounds
        points = 0;
    }

    public void update(float dt) {
        // use the inherited bounds from GameObj
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            setY(getY() + speed * dt);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            setY(getY() - speed * dt);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            setX(getX() - speed * dt);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            setX(getX() + speed * dt);
        }
    }

    public void addPoint() {
        points++;
    }

    public String getPoints() {
        return String.valueOf(points);
    }
}
