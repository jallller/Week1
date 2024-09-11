package app;

import java.util.*;
import java.util.stream.Collectors;

import app.Book;

public class Main {
    public static void main(String[] args) {

        List<Book> sampleBooks = Arrays.asList(
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
        );

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


        //CollectorExercise
        List<Transaction> transactions = List.of(
                new Transaction(1, 100.0, "USD"),
                new Transaction(2, 150.0, "EUR"),
                new Transaction(3, 200.0, "USD"),
                new Transaction(4, 75.0, "GBP"),
                new Transaction(5, 120.0, "EUR"),
                new Transaction(6, 300.0, "GBP")
        );

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
//        double averageAge = employees.stream()
//                .collect(Collectors.averagingDouble(Employees::getAge));
//        System.out.println("Average age: " + averageAge);

        //Find the employee with the highest salary.
    }

}



