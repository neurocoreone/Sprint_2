import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] cart = new Food[]{meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(cart);
        //TODO: вывод как в задании
        System.out.println("Общая сумма заказа без скидки " + shoppingCart.calculateCartWithDiscount());
        System.out.println("Общая сумма заказа со скидкой " + shoppingCart.calculateVegetarianCartWithoutDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.calculateCartWithoutDiscount());

    }
}
