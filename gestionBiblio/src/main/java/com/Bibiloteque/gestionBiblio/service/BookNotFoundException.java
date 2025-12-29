package com.Bibiloteque.gestionBiblio.service;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String titre){
        super("book with tire "+titre+"could not be found");
    }
}
