package app;

import java.time.LocalDate;
import java.time.Period;

public class Employee2 {
    private String name;
    private int age; // This will be computed based on birthdate
    private String department;
    private double salary;
    private LocalDate birthdate;

    // Constructor
    public Employee2(String name, LocalDate birthdate, String department, double salary) {
        this.name = name;
        this.birthdate = birthdate;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Calculate age based on birthdate
    public int getAge() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', birthdate=%s, department='%s', salary=%.2f, age=%d}",
                name, birthdate, department, salary, getAge());
    }
}
