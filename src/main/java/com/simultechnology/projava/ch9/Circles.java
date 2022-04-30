package com.simultechnology.projava.ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Circles {
    public static void main(String[] args) {
        var image= new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                if (x == y) {
                    graphics.setColor(Color.GREEN);
                } else if (y == 3) {
                    graphics.setColor(Color.BLUE);
                } else if (x == 3) {
                    graphics.setColor(Color.RED);
                } else {
                    graphics.setColor(Color.WHITE);
                }
                graphics.fillOval(x * 30 + 50, y * 30 + 20, 25, 25);
            }
        }

        var f = new JFrame("lattice");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel(new ImageIcon(image)));
        f.pack();
        f.setVisible(true);
    }
}
