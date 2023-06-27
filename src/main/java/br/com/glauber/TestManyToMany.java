package br.com.glauber;

import br.com.glauber.dao.Dao;
import br.com.glauber.model.Nephew;
import br.com.glauber.model.Uncle;

import java.util.List;

public class TestManyToMany {
    public static void main(String[] args) {
        var nephewA = new Nephew("Peter Park");
        var nephewB = new Nephew("Miles");
        var uncleA = new Uncle("Ben", List.of(nephewA, nephewB));
        var uncleB = new Uncle("Jorge", List.of(nephewA, nephewB));
        var repository = new Dao<>(Uncle.class);
        repository.save(uncleA);
        repository.save(uncleB);
        var uncleById = repository.getById(1L);
        System.out.println(uncleById);
    }
}