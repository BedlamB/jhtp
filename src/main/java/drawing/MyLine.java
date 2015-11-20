package drawing;

import java.awt.*;

public class MyLine {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private Color myColor;

    public MyLine() {
        this.setMyColor(Color.BLACK);
    }

    public MyLine(int x1, int x2, int y1, int y2, Color myColor) {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setMyColor(myColor);
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    public void draw(Graphics g) {
        g.setColor(myColor);
        g.drawLine(getX1(),getY1(), getX2(), getY2());
    }
}
