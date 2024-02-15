package characters;

public abstract class CharacterFactory {
    // Factory method for creating characters
    public abstract Character createCharacter(String sex, String hairColor, String hairLength, String eyeColor, String height, String weight);
}
