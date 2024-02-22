package characters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    @Test
    public void testInitializeStats_Dwarf() {
        Cleric cleric = new Cleric("Derrin", "male", "tall", "average", "dwarf");
        cleric.initializeStats();
        assertEquals(10, cleric.getAttack());
        assertEquals(10, Character.getMana());
        assertEquals(7, cleric.getDefense());
        assertEquals(4, cleric.getSpeed());
        assertEquals("Gains 2x money each fight won.", cleric.getSkill());
    }

    @Test
    public void testInitializeStats_Elf() {
        Cleric cleric = new Cleric("Derrin", "male", "tall", "average", "elf");
        cleric.initializeStats();
        assertEquals(10, cleric.getAttack());
        assertEquals(10, Character.getMana());
        assertEquals(7, cleric.getDefense());
        assertEquals(10, cleric.getSpeed());
        assertEquals("Recovers 2HP after every 5 floors.", cleric.getSkill());
    }

    @Test
    public void testInitializeStats_Human() {
        Cleric cleric = new Cleric("Derrin", "male", "tall", "average", "human");
        cleric.initializeStats();
        assertEquals(10, cleric.getAttack());
        assertEquals(10, Character.getMana());
        assertEquals(7, cleric.getDefense());
        assertEquals(7, cleric.getSpeed());
        assertEquals("+5 starting HP", cleric.getSkill());
    }

    @Test
    public void testInitializeStats_Orc() {
        Cleric cleric = new Cleric("Derrin", "male", "tall", "average", "orc");
        cleric.initializeStats();
        assertEquals(10, cleric.getAttack());
        assertEquals(10, Character.getMana());
        assertEquals(7, cleric.getDefense());
        assertEquals(5, cleric.getSpeed());
        assertEquals("+5 starting defense", cleric.getSkill());
    }

    @Test
    public void testInitializeStats_Tiefling() {
        Cleric cleric = new Cleric("Derrin", "male", "tall", "average", "tiefling");
        cleric.initializeStats();
        assertEquals(10, cleric.getAttack());
        assertEquals(10, Character.getMana());
        assertEquals(7, cleric.getDefense());
        assertEquals(9, cleric.getSpeed());
        assertEquals("+5 starting mana.", cleric.getSkill());
    }
}
