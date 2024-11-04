package com.victor.spring;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void returnBook(){
        System.out.println("We returning the book to library");
        System.out.println("---------------------------------------------");
    }
    public void returnMagazine(){
        System.out.println("We returning the magazine to library");
        System.out.println("---------------------------------------------");
    }
    public void getBook(Book book){
        System.out.println("We got the " + book);
        System.out.println("---------------------------------------------");
    }
    public void getMagazine(Magazine magazine){
        System.out.println("We got the " + magazine);
        System.out.println("---------------------------------------------");
    }
    public void addBook(String person_name, Book book){
        System.out.println("Adding book to the library");
        System.out.println("---------------------------------------------");
    }
    public void addMagazine(String person_name, Magazine magazine){
        System.out.println("Adding magazine to the library");
        System.out.println("---------------------------------------------");
    }
}
