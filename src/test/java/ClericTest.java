import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    @Test
    public void testCharacterSex() {
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";
        Cleric cleric = new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);

        assertNotNull(cleric);
        assertEquals(sex.toLowerCase(), cleric.getSex());
    }

    @Test
    public void testHairColor() {
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";
        Cleric cleric = new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);

        assertNotNull(cleric);
        assertEquals(hairColor.toLowerCase(), cleric.getHairColor());
    }

    @Test
    public void testHairLength() {
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";
        Cleric cleric = new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);

        assertNotNull(cleric);
        assertEquals(hairLength.toLowerCase(), cleric.getHairLength());
    }

    @Test
    public void testEyeColor() {
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";
        Cleric cleric = new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);

        assertNotNull(cleric);
        assertEquals(eyeColor.toLowerCase(), cleric.getEyeColor());
    }

    @Test
    public void testHeight() {
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";
        Cleric cleric = new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);

        assertNotNull(cleric);
        assertEquals(height.toLowerCase(), cleric.getHeight());
    }

    @Test
    public void testWeight() {
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";
        Cleric cleric = new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);

        assertNotNull(cleric);
        assertEquals(weight.toLowerCase(), cleric.getWeight());
    }

    @Test
    public void testClass() {
        String sex = "Male";
        String hairColor = "Brown";
        String hairLength = "Short";
        String eyeColor = "Blue";
        String height = "Average";
        String weight = "Average";
        Cleric cleric = new Cleric(sex, hairColor, hairLength, eyeColor, height, weight);

        assertNotNull(cleric);
        assertEquals("cleric", cleric.getCharacterClass());
    }

    @Test
    public void initializeAttributes() {
        // Given
        Cleric cleric = new Cleric("Male", "Brown", "Short", "Blue", "Average", "Average");

        // When
        cleric.initializeAttributes();

        // Then
        assertEquals(13, cleric.getStrength());
        assertEquals(15, cleric.getWisdom());
        assertEquals(2, cleric.getIntelligence());
        assertEquals(1, cleric.getCharisma());
    }
}