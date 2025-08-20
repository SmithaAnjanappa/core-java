package com.xworkz.libraryapp;

import com.xworkz.libraryapp.books.Books;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Books books = new Books();
        books.setBookId(1);
        books.setBookName("Java");
        books.setAuthorName("games gosling");
        books.setPrice(890.56);
        books.setPublishedYear("1989");
        books.setNoOfPages(560);


        Library library = new Library();
        boolean register=library.libraryRegistration(books);
        System.out.println("the user is registered "+register);
        if (register){
            library.getInfo();
        }

    }
}
