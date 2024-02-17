package characters;

public class Bard extends Character {
    public Bard(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String race) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "Bard", race);
    }

    // Initialize attack, mana, and defense based on class.
    @Override
    public void initializeStats() {
        this.attack = 5;
        this.mana = 15;
        this.defense = 7;
    }

}
