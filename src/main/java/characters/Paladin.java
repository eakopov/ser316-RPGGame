package characters;

public class Paladin extends Character {
    public Paladin(String name, String sex, String height, String weight, String race) {
        super(name, sex, height, weight, "Paladin", race);
    }

    // Initialize attack, mana, and defense based on class.
    @Override
    public void initializeStats() {
        this.attack = 14;
        mana = 2;
        this.defense = 14;


        // Create character based on race
        switch (characterRace.toLowerCase()) {
            case "dwarf":
                this.speed = 4;
                this.skill = "Gains 2x money each fight won.";
                break;
            case "elf":
                this.speed = 10;
                this.skill = "Recovers 2HP after every 5 floors.";
                break;
            case "human":
                this.speed = 7;
                this.skill = "+5 starting HP";
                break;
            case "orc":
                this.speed = 5;
                this.skill = "+5 starting defense";
                break;
            case "tiefling":
                this.speed = 9;
                this.skill = "+5 starting mana.";
                break;
            default:
                throw new IllegalArgumentException("Invalid character race: " + characterRace);
        }
    }

}
