package items;

import java.util.Random;

public class Boots extends Armor {
    protected String condition;
    private String name = "Boots";

    public Boots(String condition) {
        super("Boots");
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

        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3 for attack)
                attackBonus = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5 for attack)
                attackBonus = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7 for attack)
                attackBonus = random.nextInt(4) + 4;
                break;
            default:
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        System.out.println("Boots used with condition: " + condition);
        System.out.println("Attack bonus: " + attackBonus);
    }
}