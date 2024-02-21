package items;

import static org.junit.Assert.*;
import org.junit.*;

public class MoneyTest {

    @Test
    public void testConstructor() {
        Money money = new Money();
        assertEquals(0, money.getMoney());
    }

    @Test
    public void testUseSufficientMoney() {
        Money money = new Money();
        money.add(50);
        money.use(25);
        assertEquals(25, money.getMoney());
    }

    @Test
    public void testUseInsufficientMoney() {
        Money money = new Money();
        money.add(10);
        money.use(15);
        assertEquals(10, money.getMoney());
    }

    @Test
    public void testUseWithZeroMoney() {
        Money money = new Money();
        money.use(5);
        assertEquals(0, money.getMoney());
    }

    @Test
    public void testAdd() {
        Money money = new Money();
        money.add(100);
        assertEquals(100, money.getMoney());
    }

    @Test
    public void testGetMoney() {
        Money money = new Money();
        assertEquals(0, money.getMoney());
    }

    @Test
    public void testSetMoney() {
        Money money = new Money();
        money.setMoney(50);
        assertEquals(50, money.getMoney());
    }

}
