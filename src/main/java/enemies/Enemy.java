package enemies;

public class Enemy {
    private String type;
    private int health;
    private int attack;

    public Enemy(String type, int health, int attack) {
        this.type = type;
        this.health = health;
        this.attack = attack;
    }

    // Getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
