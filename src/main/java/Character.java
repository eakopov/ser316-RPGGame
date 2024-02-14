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
    protected Character(String sex, String hairColor, String hairLength, String eyeColor,
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

    // Factory method for character creation
    public abstract Character createCharacter(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight);

    // Abstract method to initialize attributes based on character class
    protected abstract void initializeAttributes();

    // Method to calculate initial health based on height, weight, and sex
    protected int calculateInitialHealth() {
        // Implementation logic to calculate initial health
        int HP = 0;

        // Height
        if(height.equals("short")){
            // Short = Base HP 5
            HP += 5;
        } else if(height.equals("average")){
            // Average = Base HP 7
            HP += 7;
        } else {
            // Tall = Base HP 9
            HP += 9;
        }

        // Weight
        if(weight.equals("slim")){
            // Slim -= 2 HP
            HP -= 2;
        } else if(weight.equals("average")){
            // Large += 2 HP
            HP += 2;
        } // Average = no change

        // Sex
        if(sex.equals("male")){
            // male HP++;
            HP++;
        } else {
            // female HP--;
            HP--;
        }

        return HP;
    }

    /*
        Getters and setters for all Character attributes
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
