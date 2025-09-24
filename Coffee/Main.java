package Coffee;

import Coffee.Factory.CappuccinoShop;
import Coffee.Factory.CoffeeShop;
import Coffee.Factory.EspressoShop;
import Coffee.Factory.LatteShop;

public class Main {
    public static void main(String[] args) {
        CoffeeShop espressoShop = new EspressoShop();
        espressoShop.orderCoffee();

        CoffeeShop latteShop = new LatteShop();
        latteShop.orderCoffee();

        CoffeeShop cappuccinoShop = new CappuccinoShop();
        cappuccinoShop.orderCoffee();
    }
}
