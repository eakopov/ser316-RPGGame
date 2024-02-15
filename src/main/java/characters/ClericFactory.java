package characters;

public class ClericFactory extends CharacterFactory {
    // Factory method implementation for creating characters.Wizard characters
    @Override
    public Character createCharacter(String sex, String hairColor, String hairLength,
                                     String eyeColor, String height, String weight) {
        return new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);
    }
}