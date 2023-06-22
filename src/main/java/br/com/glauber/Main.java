package br.com.glauber;

import br.com.glauber.dao.Dao;
import br.com.glauber.model.Product;

public class Main {
    public static void main(String[] args) {
        var repository = new Dao<>(Product.class);
        repository.save(new Product("Coca-cola", 7.50));
        repository.save(new Product("Pizza", 15.00));
        repository.save(new Product("MacBook", 14.500));

        var allProducts = repository.getAll(3, 1);
        for (var produto: allProducts) {
            System.out.println(produto);
        }
    }
}