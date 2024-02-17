package characters;

public class Elf extends Character {
    public Elf(String name, String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String charClass) {
        super(name, sex, hairColor, hairLength, eyeColor, height, weight, charClass, "Elf");
    }

    // Initialize speed and skill based on character race
    @Override
    public void initializeStats() {
        this.speed = 10;
        this.skill = "Recovers 2HP after every 5 floors.";
    }

}
