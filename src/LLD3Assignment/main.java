package LLD3Assignment;

// Different employees in our company
// you know their salary
// calculate tax for every employee
    // 20% Professional Tax
    // 3% Education cess

// Future Requirements
// Rule for tax calculation changes
// Full time employee
    // 30% Professional Tax
    // 3% Educational cess
    // 2% Study Tax
// Intern
    // 20% PT
// Part time employees
    // 20% PT
    // 5% GST
    // 2% ST
public class main {
    public static void main(String[] args) {
        TaxCalculatorInterface taxcalculator = new TaxCalculatorImpl();
        Employee fullTimeEmployee = new FullTimeEmployee("Bittu", 100000);
        Employee partTimeEmployee = new PartTimeEmployee("Shittu", 100000);
        Employee intern = new Interns("Pittu", 100000);

        double fullTimeEmployeeTax = taxcalculator.calculateTax(fullTimeEmployee);
        double partTimeEmployeeTax = taxcalculator.calculateTax(partTimeEmployee);
        double internTax = taxcalculator.calculateTax(intern);

        System.out.println("Full time employee tax => " + fullTimeEmployeeTax);
        System.out.println("Part time employee tax => " + partTimeEmployeeTax);
        System.out.println("Intern tax => " + internTax);
    }
}
