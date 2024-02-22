package characters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    @Test
    public void testCalculateInitialHealth_ShortSlimMale() {
        Character character = new Bard("Test", "male", "short", "slim", "human");
        assertEquals(4, character.calculateInitialHealth());
    }

    @Test
    public void testCalculateInitialHealth_AverageAverageFemale() {
        Character character = new Cleric("Test", "female", "average", "average", "elf");
        assertEquals(6, character.calculateInitialHealth());
    }

    @Test
    public void testCalculateInitialHealth_TallLargeMale() {
        Character character = new Paladin("Test", "male", "tall", "large", "orc");
        assertEquals(12, character.calculateInitialHealth());
    }

    @Test
    public void testInitializeStats() {
        Character character = new Druid("Test", "female", "short", "average", "dwarf");
        character.initializeStats();
        assertEquals(8, character.getAttack());
        assertEquals(12, Character.getMana());
        assertEquals(7, character.getDefense());
        assertEquals(4, character.getSpeed());
        assertEquals("Gains 2x money each fight won.", character.getSkill());
    }

    @Test
    public void testGetName() {
        Character character = new Bard("John", "male", "average", "average", "human");
        assertEquals("John", character.getName());
    }

    @Test
    public void testSetName() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setName("Jane");
        assertEquals("Jane", character.getName());
    }

    @Test
    public void testGetSex() {
        Character character = new Bard("John", "male", "average", "average", "human");
        assertEquals("male", character.getSex());
    }

    @Test
    public void testSetSex() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setSex("female");
        assertEquals("female", character.getSex());
    }

    @Test
    public void testGetHeight() {
        Character character = new Bard("John", "male", "average", "average", "human");
        assertEquals("average", character.getHeight());
    }

    @Test
    public void testSetHeight() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setHeight("tall");
        assertEquals("tall", character.getHeight());
    }

    @Test
    public void testGetWeight() {
        Character character = new Bard("John", "male", "average", "average", "human");
        assertEquals("average", character.getWeight());
    }

    @Test
    public void testSetWeight() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setWeight("slim");
        assertEquals("slim", character.getWeight());
    }

    @Test
    public void testGetCharacterClass() {
        Character character = new Bard("John", "male", "average", "average", "human");
        assertEquals("bard", character.getCharacterClass());
    }

    @Test
    public void testSetCharacterClass() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setCharacterClass("Wizard");
        assertEquals("Wizard", character.getCharacterClass());
    }

    @Test
    public void testGetCharacterRace() {
        Character character = new Bard("John", "male", "average", "average", "human");
        assertEquals("human", character.getCharacterRace());
    }

    @Test
    public void testSetCharacterRace() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setCharacterRace("elf");
        assertEquals("elf", character.getCharacterRace());
    }

    @Test
    public void testSetAttack() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setAttack(20);
        assertEquals(20, character.getAttack());
    }

    @Test
    public void testSetMana() {
        Character character = new Bard("John", "male", "average", "average", "human");
        Character.setMana(50);
        assertEquals(50, Character.getMana());
    }

    @Test
    public void testSetDefense() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setDefense(15);
        assertEquals(15, character.getDefense());
    }

    @Test
    public void testSetSpeed() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setSpeed(8);
        assertEquals(8, character.getSpeed());
    }

    @Test
    public void testSetAndGetHealth() {
        Character character = new Bard("John", "male", "average", "average", "human");
        Character.setHealth(100);
        assertEquals(100, Character.getHealth());
    }

    @Test
    public void testSetAndGetXP() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setXP(500);
        assertEquals(500, character.getXP());
    }

    @Test
    public void testSetAndGetSkill() {
        Character character = new Bard("John", "male", "average", "average", "human");
        character.setSkill("Sword Mastery");
        assertEquals("Sword Mastery", character.getSkill());
    }
}
