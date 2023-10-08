public abstract class ShapeAbs {
    abstract double calculateArea(); // Abstract method for calculating the area
    abstract double calculatePerimeter(); // Abstract method for calculating the perimeter

    public double calculateQuantity(int quantity) {
        return 2*quantity;
    }
}
