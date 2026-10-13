package com.BryanBecerra;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
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
    
    
    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // default font
        fox = new Player();
        coin = new Coin();
        snails = new ArrayList<>();
        var snail = new Snail(700,700);
        snails.add(snail);
        timer = 0;
        yourGame = new GameState();
        randomer = new Random();
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
        //draw loop
        ScreenUtils.clear(19f/255, 171f/255, 85f/255, 1); // green background
        batch.begin();
        font.draw(batch, fox.getPoints(), 20, 50);
        fox.draw(batch);
        if (timer < TOTAL_TIME && yourGame.isOver == false) {
            coin.draw(batch);
            for (Snail theSnail : snails) {
                theSnail.draw(batch);
            }
            font.draw(batch, String.valueOf(Math.round(TOTAL_TIME - timer)), 850, 850);
        }
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
        fox.dispose();
        coin.dispose();
        for (Snail theSnail : snails) {
            theSnail.dispose();
        }
    }
}
