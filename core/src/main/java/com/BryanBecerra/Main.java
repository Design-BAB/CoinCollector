package com.BryanBecerra;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import java.util.ArrayList;
import java.util.Random;

public class Main extends ApplicationAdapter {

    public static final float TOTAL_TIME = 60;
    public static final int WIN_SIZE = 900;
    
    private SpriteBatch batch;
    private BitmapFont font;
    private Player fox;
    private Coin coin;
    private ArrayList<Snail> snails;
    private float timer;
    private GameState yourGame;
    private Random randomer;
    private GameObj grass;
    
    
    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // default font
        fox = new Player();
        coin = new Coin();
        snails = new ArrayList<>();
        timer = 0;
        yourGame = new GameState();
        randomer = new Random();
        grass = new GameObj("grass.png", 0, 0);
    }

    @Override
    public void render() {
        //update loop
        float dt = Gdx.graphics.getDeltaTime();
        timer += dt;
        fox.update(dt);
        if (fox.getBounds().overlaps(coin.getBounds())) {
            fox.addPoint();
            coin.move();
            int x = randomer.nextInt(Main.WIN_SIZE - 40);
            int y = randomer.nextInt(Main.WIN_SIZE - 40);
            while (Math.abs(fox.getX() -  x) < 100) {
                IO.println("it was too close, finding a different spot");
                x = randomer.nextInt(Main.WIN_SIZE-40);
            }
            while (Math.abs(fox.getY() - y) < 100) {
                y = randomer.nextInt(Main.WIN_SIZE - 40);
            }
            var newSnail = new Snail(x, y);
            snails.add(newSnail);
        }
        for (Snail theSnail : snails) {
            theSnail.update();
            if (fox.getBounds().overlaps(theSnail.getBounds())) {
                yourGame.isOver = true;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.R)) {
            startGame();
        }
        //draw loop
        ScreenUtils.clear(19f/255, 171f/255, 85f/255, 1); // green background
        batch.begin();
        grass.draw(batch);
        font.draw(batch, fox.getPoints(), 20, 50);
        fox.draw(batch);
        if (timer < TOTAL_TIME && yourGame.isOver == false) {
            coin.draw(batch);
            for (Snail theSnail : snails) {
                theSnail.draw(batch);
            }
            font.draw(batch, String.valueOf(Math.round(TOTAL_TIME - timer)), 850, 850);
        } else {
            yourGame.isOver = true;
            font.draw(batch, "Game Over", 400, 400);
            font.draw(batch, "Press 'R' to play again.", 400, 500);
        }
        batch.end();
    }
    
    void startGame() {
        fox.setX(450);
        fox.setY(450);
        fox.resetPoints();
        coin = new Coin();
        timer = 0;
        for (Snail theSnail : snails) {
            theSnail.dispose();
        }
        snails.clear();
        yourGame.isOver = false;
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
        fox.dispose();
        coin.dispose();
        grass.dispose();
        for (Snail theSnail : snails) {
            theSnail.dispose();
        }
    }
}
