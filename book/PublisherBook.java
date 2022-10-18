package com.solid.book;
import java.util.List;

import com.solid.book.Book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class PublisherBook extends Book{

    public PublisherBook(String title, List<String> pages) {
        super(title, pages);
        //TODO Auto-generated constructor stub
    }
    public void printToFile() {
        Book book = this;
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = book.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, book.getCurrentPage());
                    isEven = true;
                }
            } while (book.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }

    
}
