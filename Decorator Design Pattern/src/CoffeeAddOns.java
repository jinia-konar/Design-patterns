package src;

public abstract class CoffeeAddOns extends Coffee{

    protected final Coffee baseCoffee;

    protected CoffeeAddOns(String description, Coffee baseCoffee) {
        super(description);
        this.baseCoffee = baseCoffee;
    }

    @Override
    protected String getDescription() {
        return baseCoffee.getDescription() + " + " + this.description;
    }
}
