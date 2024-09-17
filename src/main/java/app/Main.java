package app;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

import app.Book;

import static app.ArithmeticOperation.ResultOP;

public class Main {
    public static void main(String[] args) {

        //Nook dataset
/*        List<Book> sampleBooks = Arrays.asList(
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 277, 4.1),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281, 4.3),
                new Book("1984", "George Orwell", 1949, 328, 4.2),
                new Book("Pride and Prejudice", "Jane Austen", 1813, 279, 4.4),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, 3.9),
                new Book("Moby Dick", "Herman Melville", 1851, 635, 3.7),
                new Book("War and Peace", "Leo Tolstoy", 1869, 1225, 4.3),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, 310, 4.5),
                new Book("Brave New World", "Aldous Huxley", 1932, 268, 4.1),
                new Book("Catch-22", "Joseph Heller", 1961, 453, 4.2)
        );*/

        //Calculate the average rating of all books
/*

        double averageRating = sampleBooks.stream()
                .collect(Collectors.averagingDouble(Book::getRating));
        System.out.println("Average rating of all books: " + averageRating);
*/


        // Filter and display books published after a specific year
/*
        int minPublicationYear = 1950;
        List<Book> booksPublishedAfter = sampleBooks.stream()
                .filter(book -> book.getPublicationYear() > minPublicationYear)
                .collect(Collectors.toList());
        System.out.println("Books published after " + minPublicationYear + ":");
        booksPublishedAfter.forEach(System.out::println);
*/


        //Sort books by rating in descending order.
/*
        List<Book> sortedBooksByRatingDesc = sampleBooks.stream()
                .sorted(Comparator.comparingDouble(Book::getRating).reversed())
                .collect(Collectors.toList());

        System.out.println("Books sorted by rating (descending):");
        sortedBooksByRatingDesc.forEach(System.out::println);
*/


        // Find and display the title of the book with the highest rating

/*
        Book titleOfBookHighest = sampleBooks.stream()
                .reduce((book1, book2) -> book1.getRating() > book2.getRating() ? book1 : book2)
                .orElse(null);
        System.out.println("Book with the highest rating: " + titleOfBookHighest.getTitle());
*/

        //Group books by author and calculate the average rating for each author’s books.
/*
        Map<String, Double> averageRatingsGroupedByAuthor = sampleBooks.stream()
                .collect(Collectors.groupingBy(
                        Book::getAuther,
                        Collectors.averagingDouble(Book::getRating)
                ));
        System.out.println("Average rating by author:");
        averageRatingsGroupedByAuthor.forEach((author, avgRating) ->
                System.out.println(author + ": " + avgRating));
*/

        //Calculate the total number of pages for all books (assuming each book has a fixed number of pages).

/*
        int numberOfPagesAllBooks = sampleBooks.stream()
                .collect(Collectors.summingInt(Book::getPages));
        System.out.println("Number of pages all books: " + numberOfPagesAllBooks);
*/


        //Transaction dataset
/*        List<Transaction> transactions = List.of(
                new Transaction(1, 100.0, "USD"),
                new Transaction(2, 150.0, "EUR"),
                new Transaction(3, 200.0, "USD"),
                new Transaction(4, 75.0, "GBP"),
                new Transaction(5, 120.0, "EUR"),
                new Transaction(6, 300.0, "GBP")
        );*/

        // Calculate the total sum of all transaction amounts
/*
        double totalSumOfTransactions = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println("Total sum of all transactions: " + totalSumOfTransactions);
*/

        // Group transactions by currency and calculate sum for each currency
/*
        Map<String, Double> amountSumsByCurrency = transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getCurrency,
                        Collectors.summingDouble(Transaction::getAmount)
                ));

        System.out.println("Grouped Sum of amounts by currency:");
        amountSumsByCurrency.forEach((currency, sum) ->
                System.out.println(currency + ": " + sum));

*/

        // Find the highest transaction amount
/*
        Transaction highestTransaction = transactions.stream()
                .reduce((transaction1, transaction2) -> transaction1.getAmount() > transaction2.getAmount() ? transaction1 : transaction2)
                .orElse(null);

        double highestTransactionAmount = highestTransaction != null ? highestTransaction.getAmount() : 0.0;
        System.out.println("Highest transaction amount: " + highestTransactionAmount);
*/

        // Find the average transaction amount
/*        double averageAmount = transactions.stream()
                .collect(Collectors.averagingDouble(Transaction::getAmount));
        System.out.println("Average transaction amount: " + averageAmount);
    }*/


        //Dataset employees
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", 30, "HR", 50000.00),
                new Employees("Bob", 45, "IT", 70000.00),
                new Employees("Charlie", 28, "Finance", 55000.00),
                new Employees("Diana", 40, "IT", 80000.00),
                new Employees("Edward", 35, "Finance", 60000.00),
                new Employees("Fiona", 32, "HR", 52000.00),
                new Employees("George", 50, "IT", 90000.00),
                new Employees("Hannah", 29, "Finance", 58000.00)
        );

        //Calculate the average age of all employees.
/*        double averageAge = employees.stream()
                .collect(Collectors.averagingDouble(Employees::getAge));
        System.out.println("Average age: " + averageAge);*/

        //Find the employee with the highest salary.
/*        Employees highestSalary = employees.stream()
                .reduce((employees1, employees2) -> employees1.getSalary() > employees2.getSalary() ? employees1 : employees2)
                .orElse(null);

        double highestSalaryAmount = highestSalary != null ? highestSalary.getSalary() : 0.0;
        System.out.println("Highest salary: " + highestSalaryAmount);*/

        //Group employees by department and calculate the average salary for each department.

/*
        Map<Double, Double> amountSumsByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employees::getSalary,
                        Collectors.averagingDouble(Employees::getSalary)
                ));

        double averageSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employees::getSalary));
        System.out.println("Average salary by department: " + averageSalary);
*/

        //Count the number of employees in each department.
/*
        Map<String, Long> employeeCountPerDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employees::getDepartment, // Group by department
                        Collectors.counting() // Count employees in each group
                ));
        System.out.println("Number of employees in each department:");
        employeeCountPerDept.forEach((department, count) ->
                System.out.println(department + ": " + count));
*/

        //Find the three oldest employees.


        //Filter and display employees whose salary is above a certain threshold.

/*
        int salaryThreshold = 70000;
        List<Employees> salaryOverThreshold = employees.stream()
                .filter(employee -> employee.getSalary() > salaryThreshold)
                .collect(Collectors.toList());
        System.out.println("Salary over threshold " + salaryThreshold + ":");
        salaryOverThreshold.forEach(System.out::println);
*/


        //Use sorted method to sort by different criteria

        //Age + descending
        List<Employees> sortByAge = employees.stream()
                .sorted(Comparator.comparingDouble(Employees::getAge).reversed()) //Desc
                .collect(Collectors.toList());

        System.out.println("Employees sorted by age (descending):");
        sortByAge.forEach(System.out::println);

        //Department
//        List<Employees> sortByName = employees.stream()
//                .sorted(Comparator.comparingDouble(Employees::getName)) //Desc
//                .collect(Collectors.toList());
//
//        System.out.println("Employees sorted by age :");
//        sortByName.forEach(System.out::println);


        //Salary

        //Name


        List<Employee2> employees2 = Arrays.asList(
                new Employee2("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
                new Employee2("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
                new Employee2("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
                new Employee2("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
                new Employee2("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        //Calculate the age of each employee based on their birthdate
        employees2.forEach(e -> System.out.println(e.getName() + " is " + e.getAge() + " years old"));

        //Calculate the average age of all employees
        double averageAge = employees.stream()
                .collect(Collectors.averagingDouble(Employees::getAge));
        System.out.println("Average age: " + averageAge);

        //Filter and display employees who have birthdays in a specific month.
/*

        Month month = Month.JANUARY;

        List<Employee2> employeesWithBirthdayInMonth = employees.stream()
                .filter(e -> e.getBirthdate().getMonth() == month)
                .collect(Collectors.toList());


*/

        /*
        @FunctionalInterface
public interface EmployeeFilter {
    boolean test(Employee employee);
}

@FunctionalInterface
public interface EmployeeTransformer {
    Employee transform(Employee employee);
}
@FunctionalInterface
public interface BonusCalculator {
    double calculateBonus(Employee employee);
}
public static List<Employee> filterEmployees(List<Employee> employees, EmployeeFilter filter) {
    return employees.stream()
        .filter(filter::test)
        .collect(Collectors.toList());
}

List<Employee> highEarners = filterEmployees(employees, e -> e.getSalary() > 60000);
highEarners.forEach(System.out::println);

public static List<Employee> transformEmployees(List<Employee> employees, EmployeeTransformer transformer) {
    return employees.stream()
        .map(transformer::transform)
        .collect(Collectors.toList());
}
List<Employee> employeesWithBonus = transformEmployees(employees, e -> new Employee(e.getName(), e.getAge(), e.getDepartment(), e.getSalary() * 1.1));
employeesWithBonus.forEach(System.out::println);

double totalBonuses = calculateTotalBonuses(employees, e -> e.getSalary() * 0.1);
System.out.println("Total bonuses: " + totalBonuses);

//3.6
public static void combinedOperations(List<Employee> employees) {
    employees.stream()
        .filter(e -> e.getSalary() > 50000)
        .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
        .map(e -> new Employee(e.getName(), e.getAge(), e.getDepartment(), e.getSalary() * 1.2))
        .forEach(System.out::println);
}
public static void handleOptionalAttributes(List<Employee> employees) {
    employees.stream()
        .map(e -> {
            Optional<String> department = Optional.ofNullable(e.getDepartment());
            return new Employee(e.getName(), e.getAge(), department.orElse("Unknown"), e.getSalary());
        })
        .forEach(System.out::println);
}
//Complete
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Sample dataset of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, "HR", 50000.00),
            new Employee("Bob", 45, "IT", 70000.00),
            new Employee("Charlie", 28, "Finance", 55000.00),
            new Employee("Diana", 40, "IT", 80000.00),
            new Employee("Edward", 35, "Finance", 60000.00),
            new Employee("Fiona", 32, "HR", 52000.00),
            new Employee("George", 50, "IT", 90000.00),
            new Employee("Hannah", 29, "Finance", 58000.00)
        );

        // Define custom functional interfaces
        EmployeeFilter highEarnerFilter = e -> e.getSalary() > 60000;
        EmployeeTransformer bonusTransformer = e -> new Employee(e.getName(), e.getAge(), e.getDepartment(), e.getSalary() * 1.1);
        BonusCalculator bonusCalculator = e -> e.getSalary() * 0.1;

        // Filter high earners
        List<Employee> highEarners = filterEmployees(employees, highEarnerFilter);
        System.out.println("High earners:");
        highEarners.forEach(System.out::println);

        // Transform employees with bonus
        List<Employee> employeesWithBonus = transformEmployees(employees, bonusTransformer);
        System.out.println("Employees with bonus:");
        employeesWithBonus.forEach(System.out::println);

        // Calculate total bonuses
        double totalBonuses = calculateTotalBonuses(employees, bonusCalculator);
        System.out.println("Total bonuses: " + totalBonuses);

        // Combined operations
        combinedOperations(employees);

        // Handle optional attributes
        handleOptionalAttributes(employees);
    }

    // Methods for custom functional interfaces
    private static List<Employee> filterEmployees(List<Employee> employees, EmployeeFilter filter) {
        return employees.stream()
            .filter(filter::test)
            .collect(Collectors.toList());
    }

    private static List<Employee> transformEmployees(List<Employee> employees, EmployeeTransformer transformer) {
        return employees.stream()
            .map(transformer::transform)
            .collect(Collectors.toList());
    }

    private static double calculateTotalBonuses(List<Employee> employees, BonusCalculator calculator) {
        return employees.stream()
            .mapToDouble(calculator::calculateBonus)
            .sum();
    }

    // Methods for advanced operations
    private static void combinedOperations(List<Employee> employees) {
        employees.stream()
            .filter(e -> e.getSalary() > 50000)
            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
            .map(e -> new Employee(e.getName(), e.getAge(), e.getDepartment(), e.getSalary() * 1.2))
            .forEach(System.out::println);
    }

    private static void handleOptionalAttributes(List<Employee> employees) {
        employees.stream()
            .map(e -> {
                Optional<String> department = Optional.ofNullable(e.getDepartment());
                return new Employee(e.getName(), e.getAge(), department.orElse("Unknown"), e.getSalary());
            })
            .forEach(System.out::println);
    }
}

         */

        /*
        import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private int age; // This will be computed based on birthdate
    private String department;
    private double salary;
    private LocalDate birthdate;

    // Constructor
    public Employee(String name, LocalDate birthdate, String department, double salary) {
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
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample dataset of employees with birthdates
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
            new Employee("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
            new Employee("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
            new Employee("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
            new Employee("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        // Display age of each employee
        employees.forEach(e -> System.out.println(e.getName() + " is " + e.getAge() + " years old."));
    }
}
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
            new Employee("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
            new Employee("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
            new Employee("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
            new Employee("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        // Calculate average age
        double averageAge = employees.stream()
            .mapToInt(Employee::getAge)
            .average()
            .orElse(0);

        System.out.println("Average age of employees: " + averageAge);
    }
}

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample dataset of employees with birthdates
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
            new Employee("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
            new Employee("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
            new Employee("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
            new Employee("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        // Display age of each employee
        employees.forEach(e -> System.out.println(e.getName() + " is " + e.getAge() + " years old."));
    }
}
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
            new Employee("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
            new Employee("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
            new Employee("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
            new Employee("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        // Calculate average age
        double averageAge = employees.stream()
            .mapToInt(Employee::getAge)
            .average()
            .orElse(0);

        System.out.println("Average age of employees: " + averageAge);
    }
}
import java.util.List;
import java.util.Arrays;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
            new Employee("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
            new Employee("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
            new Employee("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
            new Employee("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        Month targetMonth = Month.MAY; // Change to the desired month

        // Filter employees with birthdays in the target month
        List<Employee> employeesWithBirthdayInMonth = employees.stream()
            .filter(e -> e.getBirthdate().getMonth() == targetMonth)
            .collect(Collectors.toList());

        System.out.println("Employees with birthdays in " + targetMonth + ":");
        employeesWithBirthdayInMonth.forEach(System.out::println);
    }
}
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
            new Employee("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
            new Employee("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
            new Employee("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
            new Employee("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        // Group employees by birth month and count them
        Map<Month, Long> countByMonth = employees.stream()
            .collect(Collectors.groupingBy(e -> e.getBirthdate().getMonth(), Collectors.counting()));

        System.out.println("Number of employees by birth month:");
        countByMonth.forEach((month, count) -> System.out.println(month + ": " + count));
    }
}
import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1990, 5, 15), "HR", 50000.00),
            new Employee("Bob", LocalDate.of(1980, 8, 22), "IT", 70000.00),
            new Employee("Charlie", LocalDate.of(1992, 12, 1), "Finance", 55000.00),
            new Employee("Diana", LocalDate.of(1978, 6, 30), "IT", 80000.00),
            new Employee("Edward", LocalDate.of(1985, 3, 10), "Finance", 60000.00)
        );

        // Get the current month
        Month currentMonth = LocalDate.now().getMonth();

        // List employees with birthdays in the current month
        List<Employee> employeesWithBirthdayThisMonth = employees.stream()
            .filter(e -> e.getBirthdate().getMonth() == currentMonth)
            .collect(Collectors.toList());

        System.out.println("Employees with birthdays this month:");
        employeesWithBirthdayThisMonth.forEach(System.out::println);
    }
}


         */

/*
        ArithmeticOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + ResultOP(5, 3, addition));

        ArithmeticOperation subtraction = (a, b) -> a - b;
        System.out.println("subtraction: " + ResultOP(5, 3, subtraction));

        ArithmeticOperation multiplication = (a, b) -> a * b;
        System.out.println("multiplication: " + ResultOP(5, 3, multiplication));

        ArithmeticOperation division = (a, b) -> a / b;
        System.out.println("division: " + ResultOP(5, 3, addition));

        ArithmeticOperation modulus = (a, b) -> a % b;
        System.out.println("modulus: " + ResultOP(5, 3, modulus));

        ArithmeticOperation power = (a, b) -> (int) Math.pow(a, b);
        System.out.println("the power of: " + ResultOP(5, 3, power));
*/



    }

}



