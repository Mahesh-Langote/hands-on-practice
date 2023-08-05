class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        if (s >= 0) {
            salary = s;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setSalary(50000);

        System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
    }
}
