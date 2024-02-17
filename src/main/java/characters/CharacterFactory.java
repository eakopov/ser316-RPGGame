package characters;

public class CharacterFactory {
    public Character createCharacter(String characterType, String race) {
        if (characterType.equalsIgnoreCase("Druid")) {
            return new Druid(race);
        } else if (characterType.equalsIgnoreCase("Bard")) {
            return new Bard(race);
        } else if (characterType.equalsIgnoreCase("Cleric")) {
            return new Cleric(race);
        } else if (characterType.equalsIgnoreCase("Paladin")) {
            return new Paladin(race);
        } else if (characterType.equalsIgnoreCase("Wizard")) {
            return new Wizard(race);
        } else {
            throw new IllegalArgumentException("Invalid character type: " + characterType);
        }
    }
}
