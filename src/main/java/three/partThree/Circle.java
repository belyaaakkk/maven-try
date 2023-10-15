package three.partThree;

public class Circle extends Shape{
    private int x,y;
    private int radius;


    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
