/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.patterndao.daoimpl;

import ar.edu.unlar.patterndao.dao.BookDao;
import ar.edu.unlar.patterndao.objects.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lrcoder
 */
public class BookDaoImpl implements BookDao{
    
      //list is working as a database
    private List<Book> books;

    public BookDaoImpl() {
        books = new ArrayList<>();
        books.add(new Book(1, "Java"));
        books.add(new Book(2, "Python"));
        books.add(new Book(3, "Android"));
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookByIsbn(int isbn) {
       return books.stream()
                .filter(book -> book.getIsbn() == isbn)
                .findFirst()
                .get();
       
    }

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(int isbn) {
        Book bookFounded = books.stream()
                .filter(book -> book.getIsbn() == isbn)
                .findFirst()
                .get();
        
        books.remove(bookFounded);
        
    }
    
}
