package ru.yandex.practicum;

import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] cart = new Food[]{meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(cart);
        System.out.println("Общая сумма заказа со скидкой "+ shoppingCart.calculateCartWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.calculateVegetarianCartWithoutDiscount());
        System.out.println("Общая сумма заказа без скидки " + shoppingCart.calculateCartWithoutDiscount());

    }
}
