package src.coffeeImpl;

import src.Coffee;

public class Plain extends Coffee {

    public Plain() {
        super("Plain");
    }

    @Override
    public int getCost() {
        return 5;
    }
}
