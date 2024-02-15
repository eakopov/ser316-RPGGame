package characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaladinTest {

    private final PaladinFactory paladinFactory = new PaladinFactory();

    @Test
    public void testCharacterSex() {
        // Given
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";

        // When
        Character character = paladinFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Paladin);
        assertEquals(sex.toLowerCase(), character.getSex());
    }

    @Test
    public void testHairColor() {
        // Given
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";

        // When
        Character character = paladinFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Paladin);
        assertEquals(hairColor.toLowerCase(), character.getHairColor());
    }

    @Test
    public void testHairLength() {
        // Given
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";

        // When
        Character character = paladinFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Paladin);
        assertEquals(hairLength.toLowerCase(), character.getHairLength());
    }

    @Test
    public void testEyeColor() {
        // Given
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";

        // When
        Character character = paladinFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Paladin);
        assertEquals(eyeColor.toLowerCase(), character.getEyeColor());
    }

    @Test
    public void testHeight() {
        // Given
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";

        // When
        Character character = paladinFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Paladin);
        assertEquals(height.toLowerCase(), character.getHeight());
    }

    @Test
    public void testWeight() {
        // Given
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";

        // When
        Character character = paladinFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Paladin);
        assertEquals(weight.toLowerCase(), character.getWeight());
    }

    @Test
    public void initializeAttributes() {
        // Given
        Character character = paladinFactory.createCharacter("Male", "Brown", "Short", "Blue", "Average", "Average");

        // When
        character.initializeAttributes();

        // Then
        assertEquals(15, character.getStrength());
        assertEquals(5, character.getWisdom());
        assertEquals(7, character.getIntelligence());
        assertEquals(4, character.getCharisma());
    }

    @Test
    public void testCreateCharacter() {
        // Given
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";

        // When
        PaladinFactory paladinFactory = new PaladinFactory();
        Character character = paladinFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Paladin);
    }
}
