public class Wizard extends Character {
    public Wizard(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight, String characterClass) {
        super(sex, hairColor, hairLength, eyeColor, height, weight, characterClass);
    }

    @Override
    protected void initializeAttributes() {
        this.strength = 5;
        this.wisdom = 10;
        this.intelligence = 15;
        this.charisma = 3;
    }

    @Override
    protected void initializeWeapon() {
        this.weapon = "magic book";
    }
}
