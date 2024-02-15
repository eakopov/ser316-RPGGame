package characters;

public class Wizard extends Character {
    public Wizard(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "characters.Wizard");
    }

    @Override
    public Character createCharacter(String sex, String hairColor, String hairLength,
                                     String eyeColor, String height, String weight) {
        return new Wizard(sex, hairColor, hairLength, eyeColor, height, weight);
    }

    // Total of 31
    @Override
    public void initializeAttributes() {
        this.strength = 5;
        this.wisdom = 10;
        this.intelligence = 15;
        this.charisma = 1;
    }

}
