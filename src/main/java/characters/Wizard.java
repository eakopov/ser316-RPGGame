package characters;

public class Wizard extends Character {
    public Wizard(String name, String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String race) {
        super(name, sex, hairColor, hairLength, eyeColor, height, weight, "Wizard", race);
    }

    // Initialize attack, mana, and defense based on class.
    @Override
    public void initializeStats() {
        this.attack = 10;
        this.mana = 15;
        this.defense = 5;
    }

}
