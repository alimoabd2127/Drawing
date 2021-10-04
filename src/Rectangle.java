import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void paint(Graphics g) {
       g.setColor(this.getColor());
       g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    @Override
    public String toString() {
        return "Rectangle [" + getWidth() + "," + getHeight() + "," + getColor() + "]";
    }
}
