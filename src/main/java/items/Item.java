package items;

public abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract void use(int amount);
}