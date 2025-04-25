package src;

import src.coffeeAddOnsImpl.MilkAddOns;
import src.coffeeAddOnsImpl.SugarAddOns;
import src.coffeeImpl.Espresso;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator design pattern: Coffee shop billing system");
        Coffee myCoffee = new SugarAddOns(new Espresso());

        int cost = myCoffee.getCost();
        String description = myCoffee.getDescription();

        System.out.println(description);
        System.out.println("Cost: " + cost);
    }
}