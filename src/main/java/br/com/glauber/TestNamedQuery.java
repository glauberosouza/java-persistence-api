package br.com.glauber;

import br.com.glauber.dao.Dao;
import br.com.glauber.model.Uncle;

public class TestNamedQuery {
    public static void main(String[] args) {
        var repository = new Dao<>(Uncle.class);
        var uncleByName = repository.getNameAs("getUncleByName", "name", "Ben");
        System.out.println(uncleByName);
    }
}