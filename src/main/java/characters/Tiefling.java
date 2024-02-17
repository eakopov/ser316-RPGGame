package characters;

public class Tiefling extends Character {
    public Tiefling(String name, String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String charClass) {
        super(name, sex, hairColor, hairLength, eyeColor, height, weight, charClass, "Tiefling");
    }

    // Initialize speed and skill based on character race
    @Override
    public void initializeStats() {
        this.speed = 9;
        this.skill = "+5 starting mana.";
    }

}
