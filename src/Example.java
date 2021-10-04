import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Example {

    public static void main(String[] args) {
        Frame frame = new Frame();
        int frameWidth = 1000;
        int frameHeight = 1000;
        frame.setSize(frameWidth, frameHeight);

        ArrayList<Shape> shapes = generateShapes(100);

        for (Shape shape: shapes) {
            frame.add(shape);
            frame.setVisible(true);
        }

        System.out.println(shapes);
    }

    public static ArrayList<Shape> generateShapes(int count) {
        Random random = new Random();

        ArrayList<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int choice = random.nextInt(3);
            Shape output;
            if (choice == 0) {
                output = new Rectangle(random.nextInt(20, 100), random.nextInt(20, 100));
            } else if (choice == 1) {
                output = new Circle(random.nextInt(20, 100));
            } else {
                output = new Square(random.nextInt(20, 100));
            }
            shapes.add(output);
        }

        return shapes;
    }
}
