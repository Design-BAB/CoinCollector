package com.BryanBecerra;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player extends GameObj {

    private float speed = 400;
    public int points;
    private boolean facingRight = true;
    
    public Player() {
        super("fox.png", 200, 200); // initialize texture + bounds
        points = 0;
    }

    public void update(float dt) {
        float dx = 0, dy = 0;
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            if (this.getY() < Main.WIN_SIZE - this.getHeight()) {
                dy += speed * dt;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S) && getY() > 0) {
            dy -= speed * dt;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.A) && getX() > 0) {
                dx -= speed * dt;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            if (this.getX() < Main.WIN_SIZE - this.getWidth()) {
                dx += speed * dt;
            }
        }
        setX(getX() + dx);
        setY(getY() + dy);
        if (dx > 0 && facingRight == false) {
            flipAround();
            facingRight = true;
        } else if (dx < 0 && facingRight) {
            flipAround();
            facingRight = false;
        }
    }

    public void addPoint() {
        points++;
    }

    public String getPoints() {
        return String.valueOf(points);
    }
}
