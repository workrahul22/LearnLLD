package LLD3AssignmentPart2;

public class TaxCalculatorImpl implements TaxCalculatorInterface {
    public double calculateTax(Employee employee) {
        double professionalTax = employee.salary * 0.3;
        double educationCess = employee.salary * 0.03;
        return professionalTax + educationCess;
    }
}
