public class DataAbstractionExample {

    public static void main(String[] args) {
        CircleAbs circle = new CircleAbs(5.0, 6.0);

        RectangleAbs rectangle = new RectangleAbs(4.0, 6.0,8.0);



        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle quantity: " + circle.calculateQuantity(4));

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle quantity: " + rectangle.calculateQuantity(6));
    }

}
