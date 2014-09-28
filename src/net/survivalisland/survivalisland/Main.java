package net.survivalisland.survivalisland;

import javax.swing.*;

/**
 * Created by Richard on 2014-09-28.
 */
public class Main {

    public static void main(String[] args) {
        // SwingUtilities.invokeLater();
        new Main();
    }

    public Main() {
        JFrame frame = new JFrame();
        frame.setTitle("Survival Island Alpha 0.1");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Custom Icon
        // Custom Cursor

        // Screen

        frame.setVisible(true);
    }

}
