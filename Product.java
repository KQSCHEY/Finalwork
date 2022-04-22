package models;


import base.Fiscal;
import base.Income;


public class Product implements Income, Fiscal {


    private String name;
    private int quantity;
    private double price;
    private double taxRate = 0.05;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double taxIncome(double income) {
        return income * taxRate;
    }

    @Override
    public double income(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double income(double income, double taxIncome) {
        return income - taxIncome;
    }
}
