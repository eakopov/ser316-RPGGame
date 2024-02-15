package characters;

public class Cleric extends Character {
    public Cleric(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "characters.Cleric");
    }

    @Override
    public Character createCharacter(String sex, String hairColor, String hairLength,
                                     String eyeColor, String height, String weight) {
        return new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);
    }

    // Total of 31
    @Override
    public void initializeAttributes() {
        this.strength = 13;
        this.wisdom = 15;
        this.intelligence = 2;
        this.charisma = 1;
    }

}
