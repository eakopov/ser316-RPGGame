package enemies;

import static org.junit.Assert.*;
import org.junit.*;

public class EnemyTest {

    @Test
    public void testConstructor() {
        Enemy enemy = new Enemy("Goblin", 50, 10, 1);
        assertEquals("Goblin", enemy.getType());
        assertEquals(50, enemy.getHealth());
        assertEquals(10, enemy.getAttack());
        assertEquals(1, enemy.getLevel());
        assertFalse(enemy.isDead());
    }

    @Test
    public void testSettersAndGetters() {
        Enemy enemy = new Enemy("Goblin", 50, 10, 1);
        enemy.setType("Orc");
        assertEquals("Orc", enemy.getType());

        enemy.setHealth(70);
        assertEquals(70, enemy.getHealth());

        enemy.setAttack(15);
        assertEquals(15, enemy.getAttack());

        enemy.setLevel(2);
        assertEquals(2, enemy.getLevel());
    }

    @Test
    public void testIsDeadAlive() {
        Enemy enemy = new Enemy("Goblin", 50, 10, 1);
        assertFalse(enemy.isDead());
    }

    @Test
    public void testIsDeadDead() {
        Enemy enemy = new Enemy("Goblin", 0, 10, 1);
        assertTrue(enemy.isDead());
    }
}
