/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unlar.patterndao.dao;

import ar.edu.unlar.patterndao.objects.Book;
import java.util.List;

/**
 *
 * @author lrcoder
 */
public interface BookDao {
    
    public List<Book> getAllBooks();
    public Book getBookByIsbn(int isbn);
    void saveBook(Book book);
    void deleteBook(int isbn);
    
}
