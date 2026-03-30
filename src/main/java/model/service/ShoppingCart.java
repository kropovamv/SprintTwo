package model.service;

import model.Apple;
import model.Discountable;
import model.Food;
import model.Meat;

public class ShoppingCart {
    private final Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalAmountWithoutDiscount (){
        double total = 0.0;
        for (Food item : items) {
            total = total + item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double totalAmountWithDiscount() {
        double total = 0.0;
        for (Food item : items) {
            double discount = 0.0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            total += item.getAmount() * item.getPrice() * (100 - discount) / 100;
        }
        return total;
    }

    public double totalVegetarianWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total = total + item.getAmount() * item.getPrice();
            }
        }
        return total;
    }

}
