public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get the person's details
    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}
