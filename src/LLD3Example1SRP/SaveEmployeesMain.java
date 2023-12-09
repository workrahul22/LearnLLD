package LLD3Example1SRP;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        for(Employee e: employees) {
            Employee.save(e);
        }
    }
}
