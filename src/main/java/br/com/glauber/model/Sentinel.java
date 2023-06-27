package br.com.glauber.model;

import javax.persistence.Entity;

@Entity
public class Sentinel extends Machine {
    private boolean aggressive;

    public Sentinel() {

    }

    public Sentinel(String name, String serialNumber, boolean aggressive) {
        super(name, serialNumber);
        this.aggressive = aggressive;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    @Override
    public String toString() {
        return "Sentinel{" +
                "aggressive=" + aggressive +
                '}';
    }
}
