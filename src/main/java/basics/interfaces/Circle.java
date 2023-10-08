public class Circle implements Shape,Quantity {
    private double radius;

    private double quantity;

    public Circle(double radius, double quantity) {
        this.radius = radius;
        this.quantity = quantity;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    public double calculateQuantity() {
        return 3*quantity;
    }
}


