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

        // Filter and display books published after a specific year
//        int minPublicationYear = 1950;
//        List<Book> booksPublishedAfter = sampleBooks.stream()
//                .filter(book -> book.getPublicationYear() > minPublicationYear)
//                .collect(Collectors.toList());
//        System.out.println("Books published after " + minPublicationYear + ":");
//        booksPublishedAfter.forEach(System.out::println);


        //Sort books by rating in descending order.
//        List<Book> sortedBooksByRatingDesc = sampleBooks.stream()
//                .sorted(Comparator.comparingDouble(Book::getRating).reversed())
//                .collect(Collectors.toList());
//
//        System.out.println("Books sorted by rating (descending):");
//        sortedBooksByRatingDesc.forEach(System.out::println);


        // Find and display the title of the book with the highest rating

        Book titleOfBookHighest = sampleBooks.stream()
                .reduce((book1, book2) -> book1.getRating() > book2.getRating() ? book1 : book2)
                .orElse(null);
        System.out.println("Book with the highest rating: " + titleOfBookHighest.getTitle());


    }


    //Group books by author and calculate the average rating for each author’s books.

    //Calculate the total number of pages for all books (assuming each book has a fixed number of pages).

};

