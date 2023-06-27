package br.com.glauber;

public class TotalSales {
    private Double total;

    public TotalSales(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TotalSales{" +
                "total=" + total +
                '}';
    }
}
