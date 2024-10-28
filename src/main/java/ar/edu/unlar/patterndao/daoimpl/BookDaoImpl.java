/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.patterndao.daoimpl;

import ar.edu.unlar.patterndao.dao.BookDao;
import ar.edu.unlar.patterndao.objects.Book;
import ar.edu.unlar.patterndao.utils.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lrcoder
 */
public class BookDaoImpl implements BookDao{
    
    public BookDaoImpl() {

    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> listadoLibros = new ArrayList<>();
        try {
            String query = "select * from books;";
            
            Connection conn = ConnectionDB.obtenerConexion();
            
            try (Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query))
                
            {
                while(rs.next()){
                    String isbn = rs.getString("isbn");
                    String name = rs.getString("name");
                    int id = rs.getInt("id");
                    // Esto es un registro de la tabla libros convertido en objeto
                    Book book = new Book(id, isbn,name);
                    listadoLibros.add(book);
                    //System.out.println(nombre+" "+apellido);
                    
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoLibros;
       
    }

    @Override
    public Book getBookByIsbn(String isbn) {
       return new Book();
       
    }

    @Override
    public void saveBook(Book book) {
       throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void deleteBook(int isbn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
