public class EmployeeDetails {
    private String employeeName;
    private int employeeAge;
    private int employeeId;

    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeDetails(int serialNumber,String employeeName, int employeeAge, int employeeId) {
        this.serialNumber = serialNumber;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeId = employeeId;
    }


    public void displayDetails() {

        System.out.println("********** employee " + this.getSerialNumber()+" details ***********");
        System.out.println("Name: " + this.getEmployeeName());
        System.out.println("Age: " + this.getEmployeeAge());
        System.out.println("ID: " + this.getEmployeeId());
    }
}
