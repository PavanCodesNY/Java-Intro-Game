package game;

import java.util.logging.Logger;
import java.awt.Canvas;

public class Game extends Canvas implements Runnable{
    public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 12 * 9;

    public Thread thread;
    private boolean running = false;

    public Game(){
        new Window(WIDTH, HEIGHT, "Lets Build a game!", this);
    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop(){
        try {
            thread.join();
            running = false;            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run(){

    }

    public static void main(String[] args){
        new Game();
    }
}
