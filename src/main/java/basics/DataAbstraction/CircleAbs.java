public class CircleAbs extends ShapeAbs{
    private double radius;

    private double quantity;

    public CircleAbs(double radius, double quantity) {
        this.radius = radius;
        this.quantity = quantity;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


}


