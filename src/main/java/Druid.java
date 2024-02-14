public class Druid extends Character {
    public Druid(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, "Druid");
    }

    @Override
    public Character createCharacter(String sex, String hairColor, String hairLength,
                                     String eyeColor, String height, String weight) {
        return new Druid(sex, hairColor, hairLength, eyeColor, height, weight);
    }

    // Total of 31
    @Override
    protected void initializeAttributes() {
        this.strength = 2;
        this.wisdom = 15;
        this.intelligence = 12;
        this.charisma = 2;
    }

}
