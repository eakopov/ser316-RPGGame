package enemies;

public class Enemy {
    private String type;
    private int health;
    private int attack;
    private int level;
    private boolean status = false;

    public Enemy(String type, int health, int attack, int level) {
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.level = level;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isDead(){
        if(health < 1){
            status = true;
        }
        return status;
    }
}
