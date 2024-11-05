/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unlar.patterndao.dao;

import ar.edu.unlar.patterndao.objects.Book;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author lrcoder
 */
public interface BookDao {
    
    public ArrayList<Book> getAllBooks();
    public Optional<Book> getBookByIsbn(String isbn);
    void insertBook(Book book);
    void deleteBook(int isbn);
    void updateBook(Book book);
}
