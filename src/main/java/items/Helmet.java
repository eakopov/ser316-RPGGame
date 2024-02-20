package items;

import java.util.Random;

public class Helmet extends Armor {
    protected String condition;

    public Helmet(String condition) {
        super("Helmet");
        this.condition = condition;
    }

    @Override
    public String getCondition() {
        return condition;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void use(int amount) {
        Random random = new Random();
        int attackBonus;
        int defenseBonus;

        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3 for both attack and defense)
                attackBonus = random.nextInt(3) + 1;
                defenseBonus = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5 for both attack and defense)
                attackBonus = random.nextInt(4) + 2;
                defenseBonus = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7 for both attack and defense)
                attackBonus = random.nextInt(4) + 4;
                defenseBonus = random.nextInt(4) + 4;
                break;
            default:
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        System.out.println("Helmet used with condition: " + condition);
        System.out.println("Attack bonus: " + attackBonus);
        System.out.println("Defense bonus: " + defenseBonus);
    }
}