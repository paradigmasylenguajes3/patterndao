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
        
    private int id;
    private String isbn;
    private String bookName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book() {
    }

    public Book(int id,String isbn, String bookName) {
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
    }
    
    public Book(String isbn, String bookName)
    {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
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
