package characters;

public class Human extends Character {
    public Human(String name, String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String charClass) {
        super(name, sex, hairColor, hairLength, eyeColor, height, weight, charClass, "Human");
    }

    // Initialize speed and skill based on character race
    @Override
    public void initializeStats() {
        this.speed = 7;
        this.skill = "+5 starting HP";
    }

}
