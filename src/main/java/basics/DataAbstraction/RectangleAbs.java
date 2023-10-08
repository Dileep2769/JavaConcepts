public class RectangleAbs extends ShapeAbs {
    private double length;
    private double width;

    private double quantity;

    public RectangleAbs(double length, double width, double quantity) {
        this.length = length;
        this.width = width;
        this.quantity = quantity;
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

}
