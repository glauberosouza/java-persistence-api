package br.com.glauber;

import br.com.glauber.dao.Dao;

public class TestNativeNamedQuery {
    public static void main(String[] args) {
        var repository = new Dao<>(TotalSales.class);
        var countSales = repository.getTotalNative("countSales");
        System.out.println(countSales);
    }
}
