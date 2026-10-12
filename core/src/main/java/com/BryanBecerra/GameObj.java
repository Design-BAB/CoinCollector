/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BryanBecerra;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

public class GameObj {
    
    private Texture texture;
    private Rectangle bounds;
    
    public GameObj(String textureLocation, int x, int y) {
        texture = new Texture(textureLocation);
        //the rect that give the obj collision
        bounds = new Rectangle(x, y, texture.getWidth(), texture.getHeight());
    }
    
    public Rectangle getBounds() {
        return bounds;
    }
    
    public float getX() {
        return bounds.x;
    }
    
    public float getY() {
        return bounds.y;
    }
    
    public void setX(float newX) {
        bounds.x = newX;
    }
    
    public void setY(float newY) {
        bounds.y = newY;
    }
    
    public void draw (SpriteBatch batch) {
        batch.draw(texture, bounds.x, bounds.y);
    }
    
    public void dispose() {
        texture.dispose();
    }
}
