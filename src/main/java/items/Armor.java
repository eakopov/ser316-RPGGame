package items;

import java.util.Random;

public class Armor extends Item {
    protected String condition;

    public Armor(String name) {
        super(name);
        // Set a random condition for the armor
        this.condition = generateRandomCondition();
    }

    // Method to generate a random condition for the armor
    private String generateRandomCondition() {
        String[] conditions = {"poor", "good", "perfect"};
        Random random = new Random();
        return conditions[random.nextInt(conditions.length)];
    }
}