package LLD3AssignmentPart2;

public enum InternTaxCalculator implements TaxCalculatorInterface {
    INSTANCE;
    public double calculateTax(Employee employee) {
        double professionalTax = employee.salary * 0.2;
        return professionalTax;
    }
}
