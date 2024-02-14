/**
 * This abstract class defines the basic attributes and behaviors of a character in the game,
 * including their physical appearance, class, attributes, health, and experience points.
 * Subclasses of Character will provide concrete implementations for specific character classes.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */

public abstract class Character {
    // Sex: Male/Female
    protected String sex;

    // Hair Color: brown/blonde/black/red
    protected String hairColor;

    // Hair Length: none/short/medium/long
    protected String hairLength;

    // Eye Color: green/blue/gray/hazel
    protected String eyeColor;

    // Height: Short/Average/Tall
    protected String height;

    // Weight/Build: Slim/Average/Large
    protected String weight;

    // Class: Wizard/Paladin/Bard/Druid/Cleric
    protected String characterClass;

    // Attributes (based on class): Strength/Wisdom/Intelligence/Charisma
    protected int strength;
    protected int wisdom;
    protected int intelligence;
    protected int charisma;

    // Health: an integer, starts based off their height, weight, and sex
    protected int health;

    // XP (experience points): an integer, starts at 0 and increases based on fights with enemies
    protected int experiencePoints;

    // Constructor
    public Character(String sex, String hairColor, String hairLength, String eyeColor,
                     String height, String weight, String characterClass) {
        this.sex = sex.toLowerCase();
        this.hairColor = hairColor.toLowerCase();
        this.hairLength = hairLength.toLowerCase();
        this.eyeColor = eyeColor.toLowerCase();
        this.height = height.toLowerCase();
        this.weight = weight.toLowerCase();
        this.characterClass = characterClass.toLowerCase();
        // Calculate initial health based on height, weight, and sex
        this.health = calculateInitialHealth();
        this.experiencePoints = 0;
        // Initialize attributes based on character class
        initializeAttributes();
    }

    // Abstract method to initialize attributes based on character class
    protected abstract void initializeAttributes();

    // Method to calculate initial health based on height, weight, and sex
    protected int calculateInitialHealth() {
        // Implementation logic to calculate initial health

        // Height
        if(height.equals("short")){
            // Short = Base HP 5
            health = health + 5;
        } else if(height.equals("average")){
            // Average = Base HP 7
            health = health + 7;
        } else {
            // Tall = Base HP 9
            health = health + 9;
        }

        // Weight
        if(weight.equals("slim")){
            // Slim -= 2 HP
            health -= 2;
        } else if(weight.equals("average")){
            // Large += 2 HP
            health += 2;
        } // Average = no change

        // Sex
        if(sex.equals("male")){
            // male HP++;
            health++;
        } else {
            // female HP--;
            health--;
        }

        return 0;
    }
}
