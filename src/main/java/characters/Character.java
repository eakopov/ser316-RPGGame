package characters;

/**
 * This abstract class defines the basic stats and behaviors of a character in the game,
 * including their physical appearance, class, stats, health, and experience points.
 * Subclasses of Character will provide concrete implementations for specific character classes.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */

public abstract class Character {

    // Name: Character's name
    protected String name;

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

    // Race: Human/Elf/Orc/Dwarf/Tiefling
    protected String characterRace;

    // Stats (based on class/race): Attack/Health/Mana/Defense/XP/Speed/Skill
    protected int attack;
    protected int health;
    protected int mana;
    protected int defense;
    protected int xp;
    protected int speed;
    protected String skill;

    // Constructor
    protected Character(String name, String sex, String hairColor, String hairLength, String eyeColor,
                        String height, String weight, String characterClass, String characterRace) {
        this.name = name;
        this.sex = sex.toLowerCase();
        this.hairColor = hairColor.toLowerCase();
        this.hairLength = hairLength.toLowerCase();
        this.eyeColor = eyeColor.toLowerCase();
        this.height = height.toLowerCase();
        this.weight = weight.toLowerCase();
        this.characterClass = characterClass.toLowerCase();
        this.characterRace = characterRace.toLowerCase();
        // Calculate initial health based on height, weight, class, race, etc
        this.health = calculateInitialHealth();
        // Calculate initial stats based on class and race
        initializeStats();
    }

    // Abstract method to initialize stats based on character class
    public abstract void initializeStats();

    // Method to calculate initial health based on height, weight, and sex
    protected int calculateInitialHealth() {
        // Implementation logic to calculate initial health
        int HP = 0;

        // Height
        if (height.equals("short")) {
            // Short = Base HP 5
            HP += 5;
        } else if (height.equals("average")) {
            // Average = Base HP 7
            HP += 7;
        } else {
            // Tall = Base HP 9
            HP += 9;
        }

        // Weight
        if (weight.equals("slim")) {
            // Slim -= 2 HP
            HP -= 2;
        } else if (weight.equals("large")) {
            // Large += 2 HP
            HP += 2;
        } // Average = no change

        // Sex
        if (sex.equals("male")) {
            // male HP++;
            HP++;
        } else {
            // female HP--;
            HP--;
        }

        return HP;
    }

    /*
        Getters and setters for all Character stats
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(String characterRace) {
        this.characterRace = characterRace;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public static int getMana() {
        return mana;
    }

    public static void setMana(int mana) {
        this.mana = mana;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        this.health = health;
    }

    public int getXP() {
        return xp;
    }

    public void setXP(int xp) {
        this.xp = xp;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
