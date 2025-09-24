package Coffee.Factory;

import Coffee.Coffee;
import Coffee.Products.Espresso;

public class EspressoShop extends CoffeeShop {
    protected Coffee createCoffee() {
        return new Espresso();
    }
}
