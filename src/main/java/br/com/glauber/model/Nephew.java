package br.com.glauber.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Nephew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idt;
    private String name;
    @ManyToMany(cascade = CascadeType.PERSIST, mappedBy = "nephews")
    private List<Uncle> uncles = new ArrayList<>();

    public Nephew() {
    }

    public Nephew(String name) {
        this.name = name;
    }

    public Nephew(String name, List<Uncle> uncles) {
        this.name = name;
        this.uncles = uncles;
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

    public List<Uncle> getUncles() {
        return uncles;
    }

    public void setUncles(List<Uncle> uncles) {
        this.uncles = uncles;
    }

    @Override
    public String toString() {
        return "Nephew{" +
                "idt=" + idt +
                ", name='" + name +
                '}';
    }
}
