import java.awt.*;

public class Circle extends Shape {
    public Circle(int diameter) {
        super(diameter, diameter);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    @Override
    public String toString() {
        return "Circle [" + getWidth() + "," + getHeight() + "," + getColor() + "]";
    }
}
