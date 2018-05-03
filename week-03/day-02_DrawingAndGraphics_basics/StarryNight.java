import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.black);
        graphics.fillRect(0,0,WIDTH, HEIGHT);
        int color = 0;
        int starSize = 2;
        for (int i = 0; i < 50; i++) {
            color = (int) (0+Math.random()*255);
            graphics.setColor(new Color(color, color, color));
            graphics.fillRect((int) (0+Math.random()*WIDTH),(int) (0+Math.random()*HEIGHT),starSize, starSize);
        }
        }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}