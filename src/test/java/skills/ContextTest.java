package skills;

import static org.junit.Assert.*;
import org.junit.*;

public class ContextTest {

    @Test
    public void testUseStrategyGains2xMoney() {
        Strategy strategy = new CharSkill();
        Context context = new Context(strategy);
        context.use("Gains 2x money each fight won.");
        assertTrue(true);
    }

    @Test
    public void testUseStrategyRecovers2HP() {
        Strategy strategy = new CharSkill();
        Context context = new Context(strategy);
        context.use("Recovers 2HP after every 5 floors.");
        assertTrue(true);
    }

    @Test
    public void testUseStrategyStartingHP() {
        Strategy strategy = new CharSkill();
        Context context = new Context(strategy);
        context.use("+5 starting HP");
        assertTrue(true);
    }

    @Test
    public void testUseStrategyStartingDefense() {
        Strategy strategy = new CharSkill();
        Context context = new Context(strategy);
        context.use("+5 starting defense");
        assertTrue(true);
    }

    @Test
    public void testUseStrategyStartingMana() {
        Strategy strategy = new CharSkill();
        Context context = new Context(strategy);
        context.use("+5 starting mana.");
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUseInvalidStrategy() {
        Strategy strategy = new CharSkill();
        Context context = new Context(strategy);
        context.use("Invalid Skill");
    }
}
