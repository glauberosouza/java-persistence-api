package br.com.glauber.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idt;
    @Column(length = 200, nullable = false)
    private String name;
    @Column(precision = 11, scale = 2, nullable = false)
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public Long getIdt() {
        return idt;
    }

    public void setIdt(Long idt) {
        this.idt = idt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idt=" + idt +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
