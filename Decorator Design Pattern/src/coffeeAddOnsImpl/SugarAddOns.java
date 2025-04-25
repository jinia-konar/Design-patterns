package src.coffeeAddOnsImpl;

import src.Coffee;
import src.CoffeeAddOns;

public class SugarAddOns extends CoffeeAddOns {

    public SugarAddOns(Coffee baseCoffee) {
        super("Sugar", baseCoffee);
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost() + 10;
    }
}
