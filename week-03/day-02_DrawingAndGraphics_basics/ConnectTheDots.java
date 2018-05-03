import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {

        int[][] boxPointCoordinates = new int[][] {
            {10, 10, 290, 10},
            {290, 10, 290, 290},
            {290, 290, 10, 290},
            {10, 290, 10, 10} };

        for (int i = 0; i < boxPointCoordinates.length; i++) {
            ConnectTheDots(graphics, boxPointCoordinates[i]);
        }
        int[][] foxPointCoordinates = new int[][] {
                {50, 100, 70, 70},
                {70, 70, 80, 90},
                {80, 90, 90, 90},
                {90, 90, 100, 70},
                {100, 70, 120, 100},
                {120, 100, 85, 130},
                {85, 130, 50, 100},
                {50, 100, 50, 100}};

        for (int i = 0; i < foxPointCoordinates.length; i++) {
            ConnectTheDots(graphics, foxPointCoordinates[i]);
        }
    }

    public static void ConnectTheDots(Graphics g, int[] coordinatesOfTwoPoints) {
        g.drawLine(coordinatesOfTwoPoints[0],coordinatesOfTwoPoints[1], coordinatesOfTwoPoints[2], coordinatesOfTwoPoints[3]);
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


// create a 300x300 canvas.