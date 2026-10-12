package com.BryanBecerra;

import java.util.Random;

public class Coin extends GameObj{
    
    private Random randomNumbers;

    public Coin() {
        super("coin.png", 300, 300);
        randomNumbers = new Random();
    }
    
    public void move() {
        var newY = randomNumbers.nextInt((int) (700 - getBounds().width));
        setY(newY);
        var newX = randomNumbers.nextInt((int) (500 - getBounds().height));
        setX(newX);
    }
}
