package enemies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EnemyFactoryTest {

    @Test
    public void testCreateGoblin() {
        Floor.setFloor(3);
        EnemyFactory factory = new EnemyFactory();
        Enemy goblin = factory.createEnemy("Goblin");

        assertEquals("Goblin", goblin.getType());
        assertEquals(5, goblin.getHealth());
        assertEquals(2, goblin.getAttack());
        assertEquals(3, goblin.getLevel());
        assertFalse(goblin.isDead());
    }

    @Test
    public void testCreateSkeleton() {
        Floor.setFloor(4);
        EnemyFactory factory = new EnemyFactory();
        Enemy skeleton = factory.createEnemy("Skeleton");

        assertEquals("Skeleton", skeleton.getType());
        assertEquals(10, skeleton.getHealth());
        assertEquals(5, skeleton.getAttack());
        assertEquals(4, skeleton.getLevel());
        assertFalse(skeleton.isDead());
    }

    @Test
    public void testCreateOrc() {
        Floor.setFloor(5);
        EnemyFactory factory = new EnemyFactory();
        Enemy orc = factory.createEnemy("Orc");

        assertEquals("Orc", orc.getType());
        assertEquals(20, orc.getHealth());
        assertEquals(10, orc.getAttack());
        assertEquals(5, orc.getLevel());
        assertFalse(orc.isDead());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidEnemy() {
        Floor.setFloor(3);
        EnemyFactory factory = new EnemyFactory();
        factory.createEnemy("Dragon");
    }
}
