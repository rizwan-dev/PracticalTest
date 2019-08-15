package com.irysgroup.practicaltest.model;

public class Invoice {
    private String name;
    private int count;
    private String sales;

    public Invoice(String name, int count, String sales) {
        this.name = name;
        this.count = count;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }
}
