public class SampleTestClass1 {
    // Attributes

    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("Alice", 30);

        // Accessing the object's attributes and methods
        System.out.println("Person 1 Details: " + person1.getDetails());

        // Creating another object of the Person class
        Person person2 = new Person("Bob", 25);

        // Accessing the second object's attributes and methods
        System.out.println("Person 2 Details: " + person2.getDetails());
    }
}