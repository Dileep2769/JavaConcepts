public class Rectangle implements Shape,Quantity {
    private double length;
    private double width;

    private double quantity;

    public Rectangle(double length, double width, double quantity) {
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

    @Override
    public double calculateQuantity() {
        return 2*quantity;
    }
}
