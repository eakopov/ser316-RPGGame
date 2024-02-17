package characters;

public class Druid extends Character {
    public Druid(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String race) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "Druid", race);
    }

    // Initialize attack, mana, and defense based on class.
    @Override
    public void initializeStats() {
        this.attack = 8;
        this.mana = 12;
        this.defense = 7;
    }

}
