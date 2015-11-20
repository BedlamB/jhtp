package drawing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {

    private Random rnd = new Random();
    private MyLine[] lines;
    private MyOval[] ovals;
    private MyRectangle[] rectangles;

    public DrawPanel() {
        setBackground(Color.WHITE);
        lines = new MyLine[5];
        ovals = new MyOval[5];
        rectangles = new MyRectangle[5];

        for (int count = 0; count < lines.length; count++) {
            int x1 = rnd.nextInt(300);
            int y1 = rnd.nextInt(300);
            int x2 = rnd.nextInt(300);
            int y2 = rnd.nextInt(300);

            Color color = new Color(rnd.nextInt(256), rnd.nextInt(256),
                    rnd.nextInt(256));
            lines[count] = new MyLine(x1, y1, x2, y2, color);
            ovals[count] = new MyOval(x1, y1, x2, y2, color, rnd.nextBoolean());
            rectangles[count] = new MyRectangle(x1, x2, y1, y2, color, rnd.nextBoolean());

        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyLine line : lines) {
           line.draw(g);
        }
        for (MyRectangle rectangle : rectangles) {
            rectangle.draw(g, rectangle.getFilled());
        }
        for (MyOval oval : ovals) {
            oval.draw(g, oval.getFilled());
        }
    }
}
