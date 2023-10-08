public class InterfaceExample {

        public static void main(String[] args) {
            Circle circle = new Circle(5.0, 6.0);

            Rectangle rectangle = new Rectangle(4.0, 6.0,8.0);



            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
            System.out.println("Circle quantity: " + circle.calculateQuantity());

            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
            System.out.println("Rectangle quantity: " + rectangle.calculateQuantity());
        }

}
