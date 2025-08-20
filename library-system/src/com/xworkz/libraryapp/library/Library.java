package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.books.Books;
import com.xworkz.libraryapp.validation.Validation;

public class Library {
    Books books;
    public boolean libraryRegistration(Books books){
        boolean isRegistered=false;
        Validation validation=new Validation();
        boolean valid=validation.checkValid(books);
        if (valid){
            this.books=books;
            isRegistered=true;
        }



        return  isRegistered;
    }

    public void getInfo(){
        System.out.println("the book id is :"+books.getBookId());
        System.out.println("the book name is :"+books.getBookName());
        System.out.println("the author name is:"+books.getAuthorName());
        System.out.println("the price is:"+books.getPrice());
        System.out.println("the published year is:"+books.getPublishedYear());
        System.out.println("the number of pages are:"+books.getNoOfPages());
    }
}
