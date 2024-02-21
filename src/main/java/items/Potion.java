package items;

import characters.Character;
import java.util.Random;

public class Potion extends Item {
    private final String condition;
    private final String name;

    private int amount;

    public Potion(String name, String condition) {
        super(name);
        this.name = name;
        this.condition = condition;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public void use(int amount) {
        Random random = new Random();

        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3)
                amount = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5)
                amount = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7)
                amount = random.nextInt(4) + 4;
                break;
            default:
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        if (name.equalsIgnoreCase("health")) {
            Character.setHealth(Character.getHealth() + amount);
            System.out.println("Your health is now: " + Character.getHealth());
        }
        if (name.equalsIgnoreCase("mana")) {
            Character.setMana(Character.getMana() + amount);
            System.out.println("Your mana is now: " + Character.getMana());
        }
    }
}
