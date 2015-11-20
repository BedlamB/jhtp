package drawing;

import java.awt.*;

public class MyRectangle {

    private int x1,y1,x2,y2;
    private Color myColor;
    private boolean filled;

    public MyRectangle() {
        this.myColor = Color.BLACK;
        filled = false;
    }

    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor, boolean filled) {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setMyColor(myColor);
        setFilled(filled);
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
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

    public boolean getFilled() {
        return filled;
    }

    public int getUpperLeftX(){
        if (x1 > x2) {
            return x1;
        } else {
            return x2;
        }
    }

    public int getUpperLeftY() {
        if (y1 > y2) {
            return y1;
        } else {
            return y2;
        }
    }

    public int getWidth() {
       return Math.abs(x1 - x2);
    }

    public int getHeight() {
        return Math.abs(y1 - y2);
    }

    public void draw(Graphics g, boolean fill) {
        g.setColor(myColor);
        if(fill) {
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } else {
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
    }
}
