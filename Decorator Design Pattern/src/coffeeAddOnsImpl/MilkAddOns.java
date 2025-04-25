package src.coffeeAddOnsImpl;

import src.Coffee;
import src.CoffeeAddOns;

public class MilkAddOns extends CoffeeAddOns {

    public MilkAddOns(Coffee baseCoffee) {
        super("Milk", baseCoffee);
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost() + 5;
    }
}
