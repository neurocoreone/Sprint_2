package service;

import model.Food;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double calculateCartWithoutDiscount() {
        double sum = 0.0;
        for (Food food : foods) {
            sum += food.getPrice() * food.getAmount();
        }
        return sum;
    }

    public double calculateCartWithDiscount() {
        double sum = 0.0;
        for (Food food : foods) {
            double finalPrice = (food.getPrice() - (food.getPrice() * food.getDiscount() / 100)) * food.getAmount();
            sum += finalPrice;
        }
        return sum;

    }

    public double calculateVegetarianCartWithoutDiscount() {
        double sum = 0.0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getPrice() * food.getAmount();
            }
        }
        return sum;
    }
}
