package LLD3AssignmentPart2;

public enum PartTimeTaxCalculator implements TaxCalculatorInterface {
    INSTANCE;
    public double calculateTax(Employee employee) {
        double professionalTax = employee.getSalary() * 0.2;
        double gst = employee.getSalary() * 0.05;
        double studyTax = employee.getSalary() * 0.02;
        return professionalTax + gst + studyTax;
    }
}
