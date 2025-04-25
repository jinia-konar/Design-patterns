package src;

public abstract class Coffee {
    protected final String description;

    protected Coffee(String description) {
        this.description = description;
    }

    public abstract int getCost();
    protected String getDescription() {
        return this.description;
    }
}
