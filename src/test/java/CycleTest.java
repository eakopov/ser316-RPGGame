import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CycleTest {

    @Test
    public void testGetPart() {
        Cycle.setPart(1);
        assertEquals(1, Cycle.getPart());
    }

    @Test
    public void testSetPart() {
        Cycle.setPart(2);
        assertEquals(2, Cycle.getPart());
    }

    @Test
    public void testCycleEffectPart1() {
        String effect = Cycle.cycleEffect(1);
        assertEquals("Gain 2x money!", effect);
    }

    @Test
    public void testCycleEffectPart2() {
        String effect = Cycle.cycleEffect(2);
        assertEquals("HP decreased by 2!", effect);
    }

    @Test
    public void testCycleEffectPart3() {
        String effect = Cycle.cycleEffect(3);
        assertEquals("Extra enemies!", effect);
    }

    @Test
    public void testCycleEffectPart4() {
        String effect = Cycle.cycleEffect(4);
        assertEquals("Attack increased by 2!", effect);
    }

    @Test
    public void testCycleEffectInvalidPart() {
        String effect = Cycle.cycleEffect(5);
        assertEquals("", effect);
    }
}
