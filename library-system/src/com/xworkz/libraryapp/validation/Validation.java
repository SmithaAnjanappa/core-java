package com.xworkz.libraryapp.validation;

import com.xworkz.libraryapp.books.Books;

public class Validation {
    public boolean checkValid(Books books){
        boolean isValidated=false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean authorValid=false;
        boolean yearValid = false;
        boolean priceValid =false;
        boolean pageValid = false;

        if (books.getBookId()!=0){
            idValid=true;
        }else {
            System.out.println("the book id s not valid");
        }

        if (books.getBookName()!=null && !books.getBookName().isEmpty()){
            nameValid=true;
        }else {
            System.out.println("the book name is not valid");
        }


        if (books.getAuthorName()!=null && !books.getAuthorName().isEmpty()){
            authorValid=true;
        }else {
            System.out.println("the author name is not valid");
        }

        if (books.getPublishedYear()!=null && !books.getPublishedYear().isEmpty()){
            yearValid=true;
        }else {
            System.out.println("the published year is not valid");
        }
        if (books.getPrice()!=0.0){
            priceValid=true;
        }else {
            System.out.println("the price is not valid");
        }
        if (books.getNoOfPages()!=0){
            pageValid=true;
        }else {
            System.out.println("the no of pages are not valid");
        }

        if (idValid && nameValid && authorValid && yearValid && priceValid && pageValid ){
            isValidated=true;
        }


        return  isValidated;
    }
}
