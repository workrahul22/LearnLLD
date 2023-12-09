package LLD3Example1SRP;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll() {
        // Employee are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);
        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee megde = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, megde);
    }
}
