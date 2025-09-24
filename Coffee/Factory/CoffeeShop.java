package Coffee.Factory;

import Coffee.Coffee;

public abstract class CoffeeShop {
    public void orderCoffee() {
        Coffee coffee = createCoffee();
        coffee.prepare();
        System.out.println("Your coffee is ready");
    }

    protected abstract Coffee createCoffee();
}
