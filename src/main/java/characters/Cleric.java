package characters;

public class Cleric extends Character {
    public Cleric(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String race) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "Cleric", race);
    }

    // Initialize attack, mana, and defense based on class.
    @Override
    public void initializeStats() {
        this.attack = 10;
        this.mana = 10;
        this.defense = 7;
    }

}
