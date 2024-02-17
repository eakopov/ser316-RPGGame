package characters;

public class Orc extends Character {
    public Orc(String name, String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String charClass) {
        super(name, sex, hairColor, hairLength, eyeColor, height, weight, charClass, "Orc");
    }

    // Initialize speed and skill based on character race
    @Override
    public void initializeStats() {
        this.speed = 5;
        this.skill = "+5 starting defense";
    }

}
