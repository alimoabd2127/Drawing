public class Square extends Rectangle {
    public Square(int size) {
        super(size, size);
    }

    @Override
    public String toString() {
        return "Square [" + getWidth() + "," + getHeight() + "," + getColor() + "]";
    }
}
