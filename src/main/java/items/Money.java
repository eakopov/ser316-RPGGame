package items;

/**
 * The Money class represents the in-game currency.
 * It allows players to manage their money by adding or using it.
 *
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class Money {
    // Name of the currency
    String name = "Money";
    // Current amount of money
    int money;

    /**
     * Constructor to initialize the money with 0.
     */
    public Money() {
        money = 0;
    }

    /**
     * Use a specified amount of money.
     *
     * @param amount The amount of money to use.
     */
    public void use(int amount) {
        if (amount > money) {
            System.out.println("You don't have enough money!");
            return;
        }
        money -= amount;
    }

    /**
     * Add a specified amount of money.
     *
     * @param amount The amount of money to add.
     */
    public void add(int amount) {
        money += amount;
    }

    /**
     * Get the current amount of money.
     *
     * @return The current amount of money.
     */
    public int getMoney() {
        return money;
    }

    /**
     * Set the amount of money.
     *
     * @param money The amount of money to set.
     */
    public void setMoney(int money) {
        this.money = money;
    }
}
