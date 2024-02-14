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

    // Weight/Build: Slim/Average/Beefy
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
        this.sex = sex;
        this.hairColor = hairColor;
        this.hairLength = hairLength;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
        this.characterClass = characterClass;
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
        return 0;
    }
}
