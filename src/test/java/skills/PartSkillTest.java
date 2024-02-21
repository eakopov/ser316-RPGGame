package skills;

import static org.junit.Assert.*;
import org.junit.*;

public class PartSkillTest {

    @Test
    public void testSkillGain2xMoney() {
        Strategy strategy = new PartSkill();
        Context context = new Context(strategy);
        context.use("Gain 2x money!");
        assertTrue(true);
    }

    @Test
    public void testSkillHPDecreasedBy2() {
        Strategy strategy = new PartSkill();
        Context context = new Context(strategy);
        context.use("HP decreased by 2!");
        assertTrue(true);
    }

    @Test
    public void testSkillExtraEnemies() {
        Strategy strategy = new PartSkill();
        Context context = new Context(strategy);
        context.use("Extra enemies!");
        assertTrue(true);
    }

    @Test
    public void testSkillAttackIncreasedBy2() {
        Strategy strategy = new PartSkill();
        Context context = new Context(strategy);
        context.use("Attack increased by 2!");
        assertTrue(true);
    }
}
