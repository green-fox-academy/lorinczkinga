import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

        int[] color = new int[3];
        int[] squareSizes = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                color[j] = (int) (0 + Math.random() * (255));
            }
            squareSizes[i] = 320-i*34;
            RainbowBoxFunction(graphics, squareSizes[i], color);
        }
    }

    public static void RainbowBoxFunction(Graphics g, int width, int[] color) {
        g.setColor(new Color(color[0], color[1], color[2]));
        g.fillRect((WIDTH - width )/ 2, (HEIGHT - width) / 2, width, width);
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