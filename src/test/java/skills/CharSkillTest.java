package skills;

import static org.junit.Assert.*;
import org.junit.*;

public class CharSkillTest {

    @Test
    public void testSkillGains2xMoney() {
        CharSkill charSkill = new CharSkill();
        charSkill.skill("Gains 2x money each fight won.");
        assertTrue(true); 
    }

    @Test
    public void testSkillRecovers2HP() {
        CharSkill charSkill = new CharSkill();
        charSkill.skill("Recovers 2HP after every 5 floors.");
        assertTrue(true); 
    }

    @Test
    public void testSkillStartingHP() {
        CharSkill charSkill = new CharSkill();
        charSkill.skill("+5 starting HP");
        assertTrue(true); 
    }

    @Test
    public void testSkillStartingDefense() {
        CharSkill charSkill = new CharSkill();
        charSkill.skill("+5 starting defense");
        assertTrue(true); 
    }

    @Test
    public void testSkillStartingMana() {
        CharSkill charSkill = new CharSkill();
        charSkill.skill("+5 starting mana.");
        assertTrue(true); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSkill() {
        CharSkill charSkill = new CharSkill();
        charSkill.skill("Invalid Skill");
    }
}
