package ar.edu.unlar.patterndao.objects;

import java.util.ArrayList;

public class Author {
    private Integer id;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();


    public Author(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
