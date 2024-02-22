package enemies;

/**
 * The Enemy class represents an enemy in the game.
 * Enemies have attributes such as type, health, attack, and level.
 * This class provides methods to access and modify these attributes.
 * It also includes a method to check if the enemy is dead.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */
public class Enemy {

    // Attributes
    private String type;
    private int health;
    private int attack;
    private int level;
    private boolean status = false;

    /**
     * Constructor to create an Enemy with specified attributes.
     *
     * @param type   The type of the enemy.
     * @param health The health of the enemy.
     * @param attack The attack power of the enemy.
     * @param level  The level of the enemy.
     */
    public Enemy(String type, int health, int attack, int level) {
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.level = level;
    }

    /**
     * Checks if the enemy is dead.
     *
     * @return true if the enemy's health is less than 1, indicating it is dead; otherwise, false.
     */
    public boolean isDead() {
        if (health < 1) {
            status = true;
        }
        return status;
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
}
