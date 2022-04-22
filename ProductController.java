package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController {
    Product model;
    SalesView view;


    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();
        double income = Rounder.rounder(model.income(model.getQuantity(),model.getPrice()));
        double taxIncome = Rounder.rounder(model.taxIncome(income));
        double clearIncome = Rounder.rounder(model.income(income,taxIncome));



        String output = "Имя товара : " + name +
                "  Общий доход : " + income +
                "  Сумма налога : " + taxIncome +
                "  Чистый доход : " + clearIncome;

        view.getOutput(output);
    }
}

