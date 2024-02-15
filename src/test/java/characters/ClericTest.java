package characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    private final ClericFactory clericFactory = new ClericFactory();

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
        Character character = clericFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Cleric);
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
        Character character = clericFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Cleric);
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
        Character character = clericFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Cleric);
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
        Character character = clericFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Cleric);
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
        Character character = clericFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Cleric);
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
        Character character = clericFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Cleric);
        assertEquals(weight.toLowerCase(), character.getWeight());
    }

    @Test
    public void initializeAttributes() {
        // Given
        Character character = clericFactory.createCharacter("Male", "Brown", "Short", "Blue", "Average", "Average");

        // When
        character.initializeAttributes();

        // Then
        assertEquals(13, character.getStrength());
        assertEquals(15, character.getWisdom());
        assertEquals(2, character.getIntelligence());
        assertEquals(1, character.getCharisma());
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
        ClericFactory clericFactory = new ClericFactory();
        Character character = clericFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Cleric);
    }
}
