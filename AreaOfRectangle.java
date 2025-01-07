class Rectangle {

    // initialize variables
    int length;
    int width;

    // constructor of rectangle class
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Find area of rectangle
    public int AreaOfRectangle() {
        return length * width;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 20);
        Rectangle rectangle2 = new Rectangle(10, 10);

        int AreaOfRectangle1 = rectangle1.AreaOfRectangle();
        int AreaOfRectangle2 = rectangle2.AreaOfRectangle();

        // System.out.println(rectangle1.AreaOfRectangle());
        // System.out.println(rectangle2.AreaOfRectangle());

        // Compare the areas of two rectangles using relational operator .
        if (AreaOfRectangle1 > AreaOfRectangle2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (AreaOfRectangle1 < AreaOfRectangle2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }

    }
}
