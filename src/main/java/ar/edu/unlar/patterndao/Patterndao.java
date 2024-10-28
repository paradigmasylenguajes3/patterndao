/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ar.edu.unlar.patterndao;

import ar.edu.unlar.patterndao.daoimpl.BookDaoImpl;
import ar.edu.unlar.patterndao.objects.Book;
import java.util.ArrayList;

/**
 *
 * @author lrcoder
 */
public class Patterndao {

    public static void main(String[] args) {
        // Agregar un libro a nuestro Data Source
        BookDaoImpl dataSource = new BookDaoImpl();
        
        ArrayList<Book> listado = dataSource.getAllBooks();
        
        System.out.println(listado.size());
        
        
    }
}
