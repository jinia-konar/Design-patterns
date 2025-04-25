package src.coffeeImpl;

import src.Coffee;

public class Espresso extends Coffee {

    public Espresso() {
        super("Espresso");
    }

    @Override
    public int getCost() {
        return 10;
    }
}
