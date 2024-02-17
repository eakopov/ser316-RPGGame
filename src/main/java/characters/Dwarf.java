package characters;

public class Dwarf extends Character {
    public Dwarf(String name, String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String charClass) {
            super(name, sex, hairColor, hairLength, eyeColor, height, weight, charClass, "Dwarf");
    }

    // Initialize speed and skill based on character race
    @Override
    public void initializeStats() {
            this.speed = 4;
            this.skill = "Gains 2x money each fight won.";
    }

}
