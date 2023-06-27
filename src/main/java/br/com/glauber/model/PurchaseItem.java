package br.com.glauber.model;

import javax.persistence.*;

@Entity
@Table(name = "purchase_item")
public class PurchaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idt;
    private int quantity;
    private double price;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idt_purchase")
    private Purchase purchase;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idt_product")
    private Product product;

    public PurchaseItem() {
    }

    public PurchaseItem(int quantity, double price, Purchase purchase, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.purchase = purchase;
        this.product = product;
    }


    @Override
    public String toString() {
        return "PurchaseItem{" +
                "idt=" + idt +
                ", quantity=" + quantity +
                ", price=" + price +
                ", purchase=" + purchase +
                ", product=" + product +
                '}';
    }
}