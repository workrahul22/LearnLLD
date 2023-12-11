package LLD3AssignmentPart2;

public abstract class Employee {
    double salary;
    String name;
    EmployeeType type;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    Employee(String name, double salary, EmployeeType type) {
        this.name = name;
        this.salary = salary;
        this.type = type;
    }
}
