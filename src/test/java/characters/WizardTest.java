package characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    private final WizardFactory wizardFactory = new WizardFactory();

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
        Character character = wizardFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Wizard);
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
        Character character = wizardFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Wizard);
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
        Character character = wizardFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Wizard);
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
        Character character = wizardFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Wizard);
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
        Character character = wizardFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Wizard);
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
        Character character = wizardFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Wizard);
        assertEquals(weight.toLowerCase(), character.getWeight());
    }

    @Test
    public void initializeAttributes() {
        // Given
        Character character = wizardFactory.createCharacter("Male", "Brown", "Short", "Blue", "Average", "Average");

        // When
        character.initializeAttributes();

        // Then
        assertEquals(5, character.getStrength());
        assertEquals(10, character.getWisdom());
        assertEquals(15, character.getIntelligence());
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
        WizardFactory wizardFactory = new WizardFactory();
        Character character = wizardFactory.createCharacter(sex, hairColor, hairLength, eyeColor, height, weight);

        // Then
        assertNotNull(character);
        assertTrue(character instanceof Wizard);
    }
}
