package characters;

import static org.junit.Assert.*;
import org.junit.*;

public class PaladinTest {

    @Test
    public void testInitializeStats_Dwarf() {
        Paladin paladin = new Paladin("Gorim", "male", "tall", "average", "dwarf");
        paladin.initializeStats();
        assertEquals(14, paladin.getAttack());
        assertEquals(2, paladin.getMana());
        assertEquals(14, paladin.getDefense());
        assertEquals(4, paladin.getSpeed());
        assertEquals("Gains 2x money each fight won.", paladin.getSkill());
    }

    @Test
    public void testInitializeStats_Elf() {
        Paladin paladin = new Paladin("Legolas", "male", "tall", "average", "elf");
        paladin.initializeStats();
        assertEquals(14, paladin.getAttack());
        assertEquals(2, paladin.getMana());
        assertEquals(14, paladin.getDefense());
        assertEquals(10, paladin.getSpeed());
        assertEquals("Recovers 2HP after every 5 floors.", paladin.getSkill());
    }

    @Test
    public void testInitializeStats_Human() {
        Paladin paladin = new Paladin("Arthur", "male", "tall", "average", "human");
        paladin.initializeStats();
        assertEquals(14, paladin.getAttack());
        assertEquals(2, paladin.getMana());
        assertEquals(14, paladin.getDefense());
        assertEquals(7, paladin.getSpeed());
        assertEquals("+5 starting HP", paladin.getSkill());
    }

    @Test
    public void testInitializeStats_Orc() {
        Paladin paladin = new Paladin("Grommash", "male", "tall", "average", "orc");
        paladin.initializeStats();
        assertEquals(14, paladin.getAttack());
        assertEquals(2, paladin.getMana());
        assertEquals(14, paladin.getDefense());
        assertEquals(5, paladin.getSpeed());
        assertEquals("+5 starting defense", paladin.getSkill());
    }

    @Test
    public void testInitializeStats_Tiefling() {
        Paladin paladin = new Paladin("Azazel", "male", "tall", "average", "tiefling");
        paladin.initializeStats();
        assertEquals(14, paladin.getAttack());
        assertEquals(2, paladin.getMana());
        assertEquals(14, paladin.getDefense());
        assertEquals(9, paladin.getSpeed());
        assertEquals("+5 starting mana.", paladin.getSkill());
    }
}
