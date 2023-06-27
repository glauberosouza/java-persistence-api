package br.com.glauber.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Uncle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idt;
    private String name;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Nephew> nephews = new ArrayList<>();

    public Uncle() {
    }

    public Uncle(String name) {
        this.name = name;
    }

    public Uncle(String name, List<Nephew> nephews) {
        this.name = name;
        this.nephews = nephews;
    }

    public long getIdt() {
        return idt;
    }

    public void setIdt(long idt) {
        this.idt = idt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Nephew> getNephews() {
        return nephews;
    }

    public void setNephews(List<Nephew> nephews) {
        this.nephews = nephews;
    }

    @Override
    public String toString() {
        return "Uncle{" +
                "idt=" + idt +
                ", name='" + name + '\'' +
                ", nephews=" + nephews +
                '}';
    }
}
