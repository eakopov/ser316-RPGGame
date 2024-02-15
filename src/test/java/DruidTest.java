import org.junit.Test;

import static org.junit.Assert.*;

public class DruidTest {

    private final DruidFactory druidFactory = new DruidFactory();

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
        Character character = druidFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Druid);
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
        Character character = druidFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Druid);
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
        Character character = druidFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Druid);
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
        Character character = druidFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Druid);
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
        Character character = druidFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Druid);
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
        Character character = druidFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Druid);
        assertEquals(weight.toLowerCase(), character.getWeight());
    }

    @Test
    public void initializeAttributes() {
        // Given
        Character character = druidFactory.createCharacter("Male", "Brown", "Short", "Blue", "Average", "Average");

        // When
        character.initializeAttributes();

        // Then
        assertEquals(2, character.getStrength());
        assertEquals(15, character.getWisdom());
        assertEquals(12, character.getIntelligence());
        assertEquals(2, character.getCharisma());
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
        DruidFactory druidFactory = new DruidFactory();
        Character character = druidFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Druid);
    }
}
