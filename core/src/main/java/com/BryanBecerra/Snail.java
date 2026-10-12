package com.BryanBecerra;

import java.util.Random;

public class Snail extends GameObj{
    
    private static final int SPEED = 1;
    private int xv;
    private int yv;
    
    
    public Snail(int x, int y) {
        var randomer = new Random();
        //int x = randomer.nextInt(Main.WIN_SIZE-10);
        //int y = randomer.nextInt(Main.WIN_SIZE-10);
        super("snail.png", x, y);
        xv = randomer.nextInt(2);
        if (xv == 0) xv = -1;
        yv = randomer.nextInt(2);
        if (yv == 0) yv = -1;
    }
    
    public void update() {       
        if (getX() > Main.WIN_SIZE || getX() < 0) {
            xv *= -1;
        }
        if (getY() > Main.WIN_SIZE || getY() < 0) {
            yv *= -1;
        }
        setX(getX() + SPEED * xv);
        setY(getY() + SPEED * yv);
        
    }
}
