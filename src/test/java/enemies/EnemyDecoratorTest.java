package enemies;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyDecoratorTest {

    @Test
    public void testDecorator() {
        Enemy enemy = new Enemy("Goblin", 50, 10, 1);
        EnemyDecorator decoratedEnemy = new EnemyDecorator(enemy, 20, 5);

        assertEquals("Goblin", decoratedEnemy.getType());
        assertEquals(70, decoratedEnemy.getHealth());
        assertEquals(15, decoratedEnemy.getAttack());
        assertEquals(1, decoratedEnemy.getLevel());
        assertFalse(decoratedEnemy.isDead());
    }

    @Test
    public void testDecoratorWithNegativeModifier() {
        Enemy enemy = new Enemy("Goblin", 50, 10, 1);
        EnemyDecorator decoratedEnemy = new EnemyDecorator(enemy, -20, -5);

        assertEquals("Goblin", decoratedEnemy.getType());
        assertEquals(30, decoratedEnemy.getHealth());
        assertEquals(5, decoratedEnemy.getAttack());
        assertEquals(1, decoratedEnemy.getLevel());
        assertFalse(decoratedEnemy.isDead());
    }

    @Test
    public void testDecoratorWithZeroModifier() {
        Enemy enemy = new Enemy("Goblin", 50, 10, 1);
        EnemyDecorator decoratedEnemy = new EnemyDecorator(enemy, 0, 0);

        assertEquals("Goblin", decoratedEnemy.getType());
        assertEquals(50, decoratedEnemy.getHealth());
        assertEquals(10, decoratedEnemy.getAttack());
        assertEquals(1, decoratedEnemy.getLevel());
        assertFalse(decoratedEnemy.isDead());
    }

    @Test
    public void testIsDeadAlive() {
        Enemy enemy = new Enemy("Goblin", 50, 10, 1);
        EnemyDecorator decoratedEnemy = new EnemyDecorator(enemy, 20, 5);
        assertFalse(decoratedEnemy.isDead());
    }

    @Test
    public void testIsDeadDead() {
        Enemy enemy = new Enemy("Goblin", 0, 10, 1);
        EnemyDecorator decoratedEnemy = new EnemyDecorator(enemy, 20, 5);
        assertTrue(decoratedEnemy.isDead());
    }
}
