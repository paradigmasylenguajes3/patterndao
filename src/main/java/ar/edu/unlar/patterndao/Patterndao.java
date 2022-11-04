/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ar.edu.unlar.patterndao;

import ar.edu.unlar.patterndao.daoimpl.BookDaoImpl;
import ar.edu.unlar.patterndao.objects.Book;

/**
 *
 * @author lrcoder
 */
public class Patterndao {

    public static void main(String[] args) {
        // Agregar un libro a nuestro Data Source
        BookDaoImpl dataSource = new BookDaoImpl();
        
        Book book = new Book(123, "Docker");
        
        dataSource.saveBook(book);
        
        
        System.out.println(dataSource.getAllBooks());
        
        dataSource.deleteBook(1);
       
        System.out.println(dataSource.getAllBooks());
        
        System.out.println(dataSource.getBookByIsbn(2));
        
        
        
        
        
    }
}
