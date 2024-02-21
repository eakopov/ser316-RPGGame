import static org.junit.Assert.*;
import org.junit.*;
import attack.*;

public class AttackTest {

    @Test
    public void testPerformAttack_Miss() {
        AttackDecorator attack = new AttackDecorator(10, 1.0, 0.0); // Always miss
        assertEquals(0, attack.performAttack()); // Expected damage is 0
    }

    @Test
    public void testPerformAttack_CritHit() {
        // Set missChance to 0 to ensure no misses
        AttackDecorator attack = new AttackDecorator(10, 0.0, 1.0); // Always crit hit
        assertEquals(20, attack.performAttack()); // Expected damage is 20 (double the attack value)
    }

    @Test
    public void testPerformAttack_NormalHit() {
        // Set missChance and critChance to 0 to ensure normal hit
        AttackDecorator attack = new AttackDecorator(10, 0.0, 0.0); // Normal hit
        assertTrue(attack.performAttack() >= 10 && attack.performAttack() <= 10); // Expected damage is the attack value
    }

}
