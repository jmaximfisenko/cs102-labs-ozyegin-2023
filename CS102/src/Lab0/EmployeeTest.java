package Lab0;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mehmet", 20, "Professor", 999.99);
        Employee employee2 = new Employee("Aydan", 25, "Doctor", 1000);

        employee1.printEmployee();
        employee2.printEmployee();
    }
}
