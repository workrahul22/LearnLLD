package LLD3Example1SRP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public abstract class Employee { // this is also responsible to manage income related data hence voilating SRP principle
    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;

    public Employee(String fullName, int monthlyIncome) {
        setMonthlyIncome(monthlyIncome);

        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getEmail() {
        return this.firstName + "." + this.lastName + "@globomanticshr.com";
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " - " + this.monthlyIncome;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        if(monthlyIncome < 0) {
            throw new IllegalArgumentException("Income must be positive");
        }

        this.monthlyIncome = monthlyIncome;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void  setNbHoursPerWeek(int nbHoursPerWeek) {
        if(nbHoursPerWeek < 0) {
            throw new IllegalArgumentException("Income must be positive");
        }
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    private static StringBuilder getEmployeeStringRep(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("### EMPLOYEE RECORD ###");
        sb.append(System.lineSeparator());
        sb.append("NAME: ");
        sb.append(employee.firstName + " " + employee.lastName);
        sb.append(System.lineSeparator());
        sb.append("POSITION: ");
        sb.append(employee.getClass().getTypeName());
        sb.append(System.lineSeparator());
        sb.append("EMAIL: ");
        sb.append(employee.getEmail());
        sb.append(System.lineSeparator());
        sb.append("MONTHLY WAGE: ");
        sb.append(employee.monthlyIncome);
        sb.append(System.lineSeparator());
        return sb;
    }

    private static Path getPathForEmployeeFile(Employee employee) {
        return Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
    }
    public static void  save(Employee employee) {
        try {
            // SRP principle is being voilated (monster method)
//            StringBuilder sb = new StringBuilder();
//            sb.append("### EMPLOYEE RECORD ###");
//            sb.append(System.lineSeparator());
//            sb.append("NAME: ");
//            sb.append(employee.firstName + " " + employee.lastName);
//            sb.append(System.lineSeparator());
//            sb.append("POSITION: ");
//            sb.append(employee.getClass().getTypeName());
//            sb.append(System.lineSeparator());
//            sb.append("EMAIL: ");
//            sb.append(employee.getEmail());
//            sb.append(System.lineSeparator());
//            sb.append("MONTHLY WAGE: ");
//            sb.append(employee.monthlyIncome);
//            sb.append(System.lineSeparator());

            StringBuilder sb = Employee.getEmployeeStringRep(employee);
//            Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
            Path path = Employee.getPathForEmployeeFile(employee);
            Files.write(path, sb.toString().getBytes());
            System.out.println("Saved employee "+employee.toString());
        } catch (IOException e) {
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}
