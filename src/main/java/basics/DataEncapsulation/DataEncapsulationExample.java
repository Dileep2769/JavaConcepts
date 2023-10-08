public class DataEncapsulationExample {
    public DataEncapsulationExample() {
    }

    public static void main(String[] args) {
        // Create a Person object
        EmployeeDetails employee1 = new EmployeeDetails(1,"Alice", 30,7976);


        EmployeeDetails employee2 = new EmployeeDetails(2,"alexa", 22,7979);

        EmployeeDetails employee3 = new EmployeeDetails(3,"adam", 24,7978);


        employee1.displayDetails();
        employee2.displayDetails();
        DisplayEmployeeDetails a = new DisplayEmployeeDetails();
        a.displayDetails(employee3);
    }
}
