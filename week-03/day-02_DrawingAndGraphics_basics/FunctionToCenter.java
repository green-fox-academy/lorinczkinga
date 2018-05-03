import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {

        int xCoord = 0;
        int yCoord = 0;

        for (int i = 0; i < 17; i++) {

            lineToTheCenter(graphics, xCoord, 0);
            lineToTheCenter(graphics, xCoord, 343);
            lineToTheCenter(graphics, 0, yCoord);
            lineToTheCenter(graphics, 320, yCoord);
            xCoord += 20;
            yCoord += 20;
        }
    }

    public static void lineToTheCenter(Graphics g, int x1, int x2) {
        g.drawLine(x1, x2, WIDTH/2, HEIGHT/2);
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