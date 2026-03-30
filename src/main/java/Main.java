import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100); // тут 500
        Apple redApple = new Apple(10, 50, Colour.RED); // тут 500, со скидкой 200
        Apple greenApple = new Apple(8, 60, Colour.GREEN); // тут 480
        Food[] products = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println(shoppingCart.totalAmountWithoutDiscount()); // общая сумма без скидки
        System.out.println(shoppingCart.totalAmountWithDiscount()); // общая сумма со скидкой
        System.out.println(shoppingCart.totalVegetarianWithoutDiscount()); // веган без скидки


    }
}
