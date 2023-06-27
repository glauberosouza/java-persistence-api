package br.com.glauber.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idt;
    private String createdAt;
    @OneToMany(mappedBy = "purchase")
    private List<PurchaseItem> purchaseItems;

    public Purchase() {
    }

    public Purchase(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "createdAt='" + createdAt + '\'' +
                '}';
    }
}
