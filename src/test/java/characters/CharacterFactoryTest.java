package characters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CharacterFactoryTest {

    @Test
    public void testCreateCharacterDruid() {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter("John", "male", "average", "average", "druid", "elf");
        assertTrue(character instanceof Druid);
        assertEquals("John", character.getName());
        assertEquals("male", character.getSex());
        assertEquals("average", character.getHeight());
        assertEquals("average", character.getWeight());
        assertEquals("druid", character.getCharacterClass());
        assertEquals("elf", character.getCharacterRace());
    }

    @Test
    public void testCreateCharacterBard() {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter("Alice", "female", "short", "slim", "bard", "human");
        assertTrue(character instanceof Bard);
        assertEquals("Alice", character.getName());
        assertEquals("female", character.getSex());
        assertEquals("short", character.getHeight());
        assertEquals("slim", character.getWeight());
        assertEquals("bard", character.getCharacterClass());
        assertEquals("human", character.getCharacterRace());
    }

    @Test
    public void testCreateCharacterCleric() {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter("Bob", "male", "tall", "average", "cleric", "dwarf");
        assertTrue(character instanceof Cleric);
        assertEquals("Bob", character.getName());
        assertEquals("male", character.getSex());
        assertEquals("tall", character.getHeight());
        assertEquals("average", character.getWeight());
        assertEquals("cleric", character.getCharacterClass());
        assertEquals("dwarf", character.getCharacterRace());
    }

    @Test
    public void testCreateCharacterPaladin() {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter("Emily", "female", "average", "large", "paladin", "human");
        assertTrue(character instanceof Paladin);
        assertEquals("Emily", character.getName());
        assertEquals("female", character.getSex());
        assertEquals("average", character.getHeight());
        assertEquals("large", character.getWeight());
        assertEquals("paladin", character.getCharacterClass());
        assertEquals("human", character.getCharacterRace());
    }

    @Test
    public void testCreateCharacterWizard() {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter("David", "male", "tall", "average", "wizard", "elf");
        assertTrue(character instanceof Wizard);
        assertEquals("David", character.getName());
        assertEquals("male", character.getSex());
        assertEquals("tall", character.getHeight());
        assertEquals("average", character.getWeight());
        assertEquals("wizard", character.getCharacterClass());
        assertEquals("elf", character.getCharacterRace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCharacterInvalidClass() {
        CharacterFactory factory = new CharacterFactory();
        factory.createCharacter("Invalid", "male", "tall", "average", "warrior", "human");
    }
}