package LLD3Example1SRP;

public class FullTimeEmployee extends Employee{
    public  FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }
}
