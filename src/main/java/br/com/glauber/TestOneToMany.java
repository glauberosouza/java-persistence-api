package br.com.glauber;

import br.com.glauber.dao.Dao;
import br.com.glauber.model.Product;
import br.com.glauber.model.Purchase;
import br.com.glauber.model.PurchaseItem;

public class TestOneToMany {
    public static void main(String[] args) {
        var purchase = new Purchase("22/06/2023");
        var product = new Product("Iphone", 3200.0);
        var purchaItem = new PurchaseItem(1, 3000.0, purchase, product);
        var repository = new Dao<>(PurchaseItem.class);
        //repository.save(purchaItem);
        var purchaseItemById = repository.getById(1L);
        System.out.println(purchaseItemById);
    }
}