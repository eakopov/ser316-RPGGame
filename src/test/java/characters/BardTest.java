package characters;

import static org.junit.Assert.*;
import org.junit.*;

public class BardTest {

    @Test
    public void testInitializeStats_Dwarf() {
        Bard bard = new Bard("Derrin", "male", "tall", "average", "dwarf");
        bard.initializeStats();
        assertEquals(5, bard.getAttack());
        assertEquals(15, bard.getMana());
        assertEquals(7, bard.getDefense());
        assertEquals(4, bard.getSpeed());
        assertEquals("Gains 2x money each fight won.", bard.getSkill());
    }

    @Test
    public void testInitializeStats_Elf() {
        Bard bard = new Bard("Derrin", "male", "tall", "average", "elf");
        bard.initializeStats();
        assertEquals(5, bard.getAttack());
        assertEquals(15, bard.getMana());
        assertEquals(7, bard.getDefense());
        assertEquals(10, bard.getSpeed());
        assertEquals("Recovers 2HP after every 5 floors.", bard.getSkill());
    }

    @Test
    public void testInitializeStats_Human() {
        Bard bard = new Bard("Derrin", "male", "tall", "average", "human");
        bard.initializeStats();
        assertEquals(5, bard.getAttack());
        assertEquals(15, bard.getMana());
        assertEquals(7, bard.getDefense());
        assertEquals(7, bard.getSpeed());
        assertEquals("+5 starting HP", bard.getSkill());
    }

    @Test
    public void testInitializeStats_Orc() {
        Bard bard = new Bard("Derrin", "male", "tall", "average", "orc");
        bard.initializeStats();
        assertEquals(5, bard.getAttack());
        assertEquals(15, bard.getMana());
        assertEquals(7, bard.getDefense());
        assertEquals(5, bard.getSpeed());
        assertEquals("+5 starting defense", bard.getSkill());
    }

    @Test
    public void testInitializeStats_Tiefling() {
        Bard bard = new Bard("Derrin", "male", "tall", "average", "tiefling");
        bard.initializeStats();
        assertEquals(5, bard.getAttack());
        assertEquals(15, bard.getMana());
        assertEquals(7, bard.getDefense());
        assertEquals(9, bard.getSpeed());
        assertEquals("+5 starting mana.", bard.getSkill());
    }
}
