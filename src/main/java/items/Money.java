package items;

public class Money {
    String name = "Money";
    int money;

    public Money() {
        money = 0;
    }

    public void use(int amount) {
        if(amount > money){
            System.out.println("You don't have enough money!");
            return;
        }
        money -= amount;
    }

    public void add(int amount) {
        money += amount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
