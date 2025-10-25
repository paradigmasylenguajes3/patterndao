package ar.edu.unlar.patterndao.dao;

import ar.edu.unlar.patterndao.objects.Author;

import java.util.ArrayList;
import java.util.Optional;

public interface AuthorDAO {
    public ArrayList<Author> getAllAuthors();
    public Optional<Author> getAuthorByIsbn(String name);
    void insertAuthor(Author Author);
    void deleteAuthor(int id);
    void updateAuthor(Author Author);
}

