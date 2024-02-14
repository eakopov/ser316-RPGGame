public class WizardFactory extends CharacterFactory {
    // Factory method implementation for creating Wizard characters
    @Override
    public Character createCharacter(String sex, String hairColor, String hairLength,
                                     String eyeColor, String height, String weight) {
        return new Wizard(sex, hairColor, hairLength, eyeColor, height, weight);
    }
}
