package drawing;

public class Rectangle {

    public float width;
    public float height;

    public Rectangle(float width, float height) {
        setWidth(width);
        setHeight(height);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if ((width > 0.0) && (width < 20.0)) {
            this.width = width;
        } else {
            width = 0;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if ((height > 0.0) && (height < 20.0)) {
            this.height = height;
        } else {
            height = 0;
        }
    }

    public float getArea() {
        return getHeight() * getWidth();
    }

    public float getPerimeter() {
        return getHeight() + getHeight() + getWidth() + getWidth();
    }
}
