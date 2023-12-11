package LLD3AssignmentPart2;


public enum FullTimeTaxCalculator implements TaxCalculatorInterface {
    INSTANCE;
    public double calculateTax(Employee employee) {
        double professionalTax = employee.getSalary() * 0.3;
        double educationalCess = employee.getSalary() * 0.03;
        double studyTax = employee.getSalary() * 0.02;
        return professionalTax + educationalCess + studyTax;
    }
}
