package three.partThree;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5, 5, 10);
        shapes[1] = new Rectangle("Blue", 2, 2, 8, 8);
        shapes[2] = new Circle("Green", 10, 10, 15);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
