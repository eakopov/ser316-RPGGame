package characters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DruidTest {

    @Test
    public void testInitializeStats_Dwarf() {
        Druid druid = new Druid("Derrin", "male", "tall", "average", "dwarf");
        druid.initializeStats();
        assertEquals(8, druid.getAttack());
        assertEquals(12, Character.getMana());
        assertEquals(7, druid.getDefense());
        assertEquals(4, druid.getSpeed());
        assertEquals("Gains 2x money each fight won.", druid.getSkill());
    }

    @Test
    public void testInitializeStats_Elf() {
        Druid druid = new Druid("Derrin", "male", "tall", "average", "elf");
        druid.initializeStats();
        assertEquals(8, druid.getAttack());
        assertEquals(12, Character.getMana());
        assertEquals(7, druid.getDefense());
        assertEquals(10, druid.getSpeed());
        assertEquals("Recovers 2HP after every 5 floors.", druid.getSkill());
    }

    @Test
    public void testInitializeStats_Human() {
        Druid druid = new Druid("Derrin", "male", "tall", "average", "human");
        druid.initializeStats();
        assertEquals(8, druid.getAttack());
        assertEquals(12, Character.getMana());
        assertEquals(7, druid.getDefense());
        assertEquals(7, druid.getSpeed());
        assertEquals("+5 starting HP", druid.getSkill());
    }

    @Test
    public void testInitializeStats_Orc() {
        Druid druid = new Druid("Derrin", "male", "tall", "average", "orc");
        druid.initializeStats();
        assertEquals(8, druid.getAttack());
        assertEquals(12, Character.getMana());
        assertEquals(7, druid.getDefense());
        assertEquals(5, druid.getSpeed());
        assertEquals("+5 starting defense", druid.getSkill());
    }

    @Test
    public void testInitializeStats_Tiefling() {
        Druid druid = new Druid("Derrin", "male", "tall", "average", "tiefling");
        druid.initializeStats();
        assertEquals(8, druid.getAttack());
        assertEquals(12, Character.getMana());
        assertEquals(7, druid.getDefense());
        assertEquals(9, druid.getSpeed());
        assertEquals("+5 starting mana.", druid.getSkill());
    }
}
