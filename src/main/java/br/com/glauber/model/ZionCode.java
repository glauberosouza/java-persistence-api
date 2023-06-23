package br.com.glauber.model;

import javax.persistence.*;

@Entity
@Table(name = "zion_code")
public class ZionCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idt;
    private String code;
    @OneToOne(mappedBy = "zionCode")
    private Captain captain;

    public ZionCode() {
    }


    public ZionCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ZionCode{" +
                "idt=" + idt +
                ", code='" + code +
                '}';
    }
}