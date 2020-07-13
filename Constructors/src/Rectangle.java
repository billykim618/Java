public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int length;

    // 1st constructor
    public Rectangle() {
        this(0, 0); // calls 2nd constructor
    }

    public Rectangle(int width, int length) {
        this(0, 0, width, length); // calls 3rd constructor
    }

    public Rectangle(int x, int y, int width, int length) {
        // initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
    }
}
