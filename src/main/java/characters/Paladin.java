package characters;

public class Paladin extends Character {
    public Paladin(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String race) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "Paladin", race);
    }

    // Initialize attack, mana, and defense based on class.
    @Override
    public void initializeStats() {
        this.attack = 14;
        this.mana = 2;
        this.defense = 14;
    }

}
