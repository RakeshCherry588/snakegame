package SnakeGame;

import javax.swing.*;

public class frame extends JFrame {
    // adding the panel to the frame
    frame() {
        this.add(new panel());

        //
        // naming the game
        this.setTitle("SnakeGame");

        // to take sure uniform window size
        this.setResizable(false);
        // to visibles the panel
        this.setVisible(true);
        // for resolution purpose we use this.pack
        this.pack();
    }
}
