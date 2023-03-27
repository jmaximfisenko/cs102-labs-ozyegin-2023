package Lab0;

public class Employee {

    private final String name;
    private final int age;
    private final String designation;
    private final double salary;

    public Employee (String n, int a, String d, double s) {
        name = n;
        age = a;
        designation = d;
        salary = s;
    }

    public void printEmployee() {
        System.out.println("---Employee Data---\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation + "\n" +
                "Salary: " + salary);
    }

}
