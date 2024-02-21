package characters;

import static org.junit.Assert.*;
import org.junit.*;

public class WizardTest {

    @Test
    public void testInitializeStats_Dwarf() {
        Wizard wizard = new Wizard("Gandalf", "male", "tall", "average", "dwarf");
        wizard.initializeStats();
        assertEquals(10, wizard.getAttack());
        assertEquals(15, wizard.getMana());
        assertEquals(5, wizard.getDefense());
        assertEquals(4, wizard.getSpeed());
        assertEquals("Gains 2x money each fight won.", wizard.getSkill());
    }

    @Test
    public void testInitializeStats_Elf() {
        Wizard wizard = new Wizard("Luna", "female", "tall", "average", "elf");
        wizard.initializeStats();
        assertEquals(10, wizard.getAttack());
        assertEquals(15, wizard.getMana());
        assertEquals(5, wizard.getDefense());
        assertEquals(10, wizard.getSpeed());
        assertEquals("Recovers 2HP after every 5 floors.", wizard.getSkill());
    }

    @Test
    public void testInitializeStats_Human() {
        Wizard wizard = new Wizard("Merlin", "male", "tall", "average", "human");
        wizard.initializeStats();
        assertEquals(10, wizard.getAttack());
        assertEquals(15, wizard.getMana());
        assertEquals(5, wizard.getDefense());
        assertEquals(7, wizard.getSpeed());
        assertEquals("+5 starting HP", wizard.getSkill());
    }

    @Test
    public void testInitializeStats_Orc() {
        Wizard wizard = new Wizard("Gork", "male", "tall", "average", "orc");
        wizard.initializeStats();
        assertEquals(10, wizard.getAttack());
        assertEquals(15, wizard.getMana());
        assertEquals(5, wizard.getDefense());
        assertEquals(5, wizard.getSpeed());
        assertEquals("+5 starting defense", wizard.getSkill());
    }

    @Test
    public void testInitializeStats_Tiefling() {
        Wizard wizard = new Wizard("Azazel", "male", "tall", "average", "tiefling");
        wizard.initializeStats();
        assertEquals(10, wizard.getAttack());
        assertEquals(15, wizard.getMana());
        assertEquals(5, wizard.getDefense());
        assertEquals(9, wizard.getSpeed());
        assertEquals("+5 starting mana.", wizard.getSkill());
    }
}
