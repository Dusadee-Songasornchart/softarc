package com.solid.book;


import java.util.List;
import java.util.concurrent.Flow.Publisher;

public class BookPublisher {
    public static void main(String[] args) {
        PublisherBook book = new PublisherBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
        
    }
}
