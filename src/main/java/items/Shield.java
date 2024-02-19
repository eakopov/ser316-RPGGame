package items;

import java.util.Random;

public class Shield extends Armor {
    protected String condition;

    public Shield(String condition) {
        super("Shield");
        this.condition = condition;
    }

    public void equip() {
        Random random = new Random();
        int defenseBonus;

        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3 for defense)
                defenseBonus = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5 for defense)
                defenseBonus = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7 for defense)
                defenseBonus = random.nextInt(4) + 4;
                break;
            default:
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        System.out.println("Shield used with condition: " + condition);
        System.out.println("Defense bonus: " + defenseBonus);
    }

    @Override
    public String getCondition() {
        return condition;
    }

    @Override
    public String getName() {
        return name;
    }
}