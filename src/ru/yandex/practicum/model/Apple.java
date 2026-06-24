package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;

import static ru.yandex.practicum.model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return DISCOUNT;
        }
        return 0;
    }
}
