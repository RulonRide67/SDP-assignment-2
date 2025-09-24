package Coffee.Factory;

import Coffee.Coffee;
import Coffee.Products.Latte;

public class LatteShop extends CoffeeShop {
    protected Coffee createCoffee() {
        return new Latte();
    }
}
