package com.solid.book;
import java.util.List;

import com.solid.book.Book;

public class ReaderBook extends Book {

    public ReaderBook(String title, List<String> pages) {
        super(title, pages);
        //TODO Auto-generated constructor stub
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
