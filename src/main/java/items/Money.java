package items;

public class Money extends Item {
    String name = "Money";
    int money;

    public Money(String name) {
        super(name);
        money = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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
