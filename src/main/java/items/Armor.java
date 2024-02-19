package items;

import java.util.Random;

public abstract class Armor extends Item {

    public Armor(String name) {
        super(name);

    }

    public abstract String getCondition();
    public abstract String getName();
}