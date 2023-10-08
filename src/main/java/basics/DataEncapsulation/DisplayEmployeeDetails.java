public class DisplayEmployeeDetails {
    public void displayDetails(EmployeeDetails employee) {

        System.out.println("********** employee " + employee.getSerialNumber()+" details ***********");
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Age: " + employee.getEmployeeAge());
        System.out.println("ID: " + employee.getEmployeeId());
    }
}
