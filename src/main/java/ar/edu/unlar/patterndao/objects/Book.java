/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.patterndao.objects;

/**
 *
 * @author lrcoder
 */
public class Book {

    private int isbn;
    private String bookName;

    public Book() {
    }

    public Book(int isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return this.bookName;
    }
    
    
}
