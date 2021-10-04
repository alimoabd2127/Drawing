import java.awt.*;
import java.util.Random;

public class Shape extends Component {
    private int width;
    private int height;
    private Color color;
    private int x;
    private int y;

    private static int[] generateRandomLocation(int width, int height) {
        Random random = new Random();

        int x = random.nextInt(1000 - width);
        int y = random.nextInt(1000 - height);

        int[] output = new int[2];
        output[0] = x;
        output[1] = y;
        return output;
    }


    private static Color generateRandomColor() {
        Random random = new Random();

        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return new Color(red, green, blue);
    }

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = generateRandomColor();
        int[] location = generateRandomLocation(width, height);
        this.x = location[0];
        this.y = location[1];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
