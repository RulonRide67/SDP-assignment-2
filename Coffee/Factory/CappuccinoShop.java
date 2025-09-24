package Coffee.Factory;

import Coffee.Coffee;
import Coffee.Products.Cappuccino;

public class CappuccinoShop extends CoffeeShop {
    protected Coffee createCoffee() {
        return new Cappuccino();
    }
}
