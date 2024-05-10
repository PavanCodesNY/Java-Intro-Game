package game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import java.awt.Component;

public class Window extends Canvas{

    public Window(int width, int height, String title, Game game){
        JFrame frame = new JFrame(title); // The frame of the game
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // It helps you exit out of the window after it is created
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Starts at the middle of the screen
        frame.add(game); // Cast the game object to Component before adding it to the frame
        frame.setVisible(true);
        game.start();
    }

}
