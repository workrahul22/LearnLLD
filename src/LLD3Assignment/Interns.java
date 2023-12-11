package LLD3Assignment;

public class Interns extends Employee {
    Interns(String name, double salary) {
        super(name, salary);
    }

    public double calculateTax() {
        double professionalTax = this.salary * 0.2;
        return professionalTax;
    }
}
