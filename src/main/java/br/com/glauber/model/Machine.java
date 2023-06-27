package br.com.glauber.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idt;
    private String name;
    private String serialNumber;

    public Machine() {
    }

    public Machine(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "idt=" + idt +
                ", name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
