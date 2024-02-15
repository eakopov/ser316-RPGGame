package characters;

public class Paladin extends Character {
    public Paladin(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "characters.Paladin");
    }

    @Override
    public Character createCharacter(String sex, String hairColor, String hairLength,
                                     String eyeColor, String height, String weight) {
        return new Paladin(sex, hairColor, hairLength, eyeColor, height, weight);
    }

    // Total of 31
    @Override
    public void initializeAttributes() {
        this.strength = 15;
        this.wisdom = 5;
        this.intelligence = 7;
        this.charisma = 4;
    }

}
