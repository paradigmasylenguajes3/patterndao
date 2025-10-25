package ar.edu.unlar.patterndao.daoimpl;

import ar.edu.unlar.patterndao.dao.AuthorDAO;
import ar.edu.unlar.patterndao.objects.Author;
import ar.edu.unlar.patterndao.objects.Author;
import ar.edu.unlar.patterndao.utils.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthorDAOImpl implements AuthorDAO {

    public AuthorDAOImpl() {

    }

    @Override
    public ArrayList<Author> getAllAuthors() {
        ArrayList<Author> listadoLibros = new ArrayList<>();
        try {
            String query = "select * from authors;";

            Connection conn = ConnectionDB.obtenerConexion();

            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    String isbn = rs.getString("isbn");
                    String name = rs.getString("name");
                    int id = rs.getInt("id");
                    // Esto es un registro de la tabla libros convertido en objeto
                    Author Author = new Author(name);
                    listadoLibros.add(Author);
                    //System.out.println(nombre+" "+apellido);

                }

            } catch (SQLException ex) {
                Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoLibros;

    }

    @Override
    public Optional<Author> getAuthorByIsbn(String isbn) {

        return Optional.empty();
    }

    @Override
    public void insertAuthor(Author entity) {
        String sql = "INSERT INTO public.authors (name) VALUES (?)";

        try {
            Connection conn = ConnectionDB.obtenerConexion();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, entity.getName());
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("fallo al intentar escribir en la base de datos");
        }

    }

    @Override
    public void deleteAuthor(int isbn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateAuthor(Author entity) {
        String sql = "UPDATE public.authors SET name='" + entity.getName() + "' WHERE id=" + entity.getId() + ";";

        try {
            Connection conn = ConnectionDB.obtenerConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}