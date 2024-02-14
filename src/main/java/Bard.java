public class Bard extends Character {
    public Bard(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "Bard");
    }

    @Override
    public Character createCharacter(String sex, String hairColor, String hairLength,
                                     String eyeColor, String height, String weight) {
        return new Bard(sex, hairColor, hairLength, eyeColor, height, weight);
    }

    // Total of 31
    @Override
    protected void initializeAttributes() {
        this.strength = 15;
        this.wisdom = 5;
        this.intelligence = 7;
        this.charisma = 17;
    }

}
