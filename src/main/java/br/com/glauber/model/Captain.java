package br.com.glauber.model;

import javax.persistence.*;

@Entity
public class Captain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idt;
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idt_zion_code", unique = true)
    private ZionCode zionCode;

    public Captain(String name, ZionCode zionCode) {
        this.name = name;
        this.zionCode = zionCode;
    }

    public Captain() {
    }

    @Override
    public String toString() {
        return "Captain{" +
                "idt=" + idt +
                ", name='" + name + '\'' +
                ", zionCode=" + zionCode +
                '}';
    }
}