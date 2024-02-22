package enemies;

/**
 * The EnemyDecorator class represents a decorator for an Enemy object.
 * It modifies the health and attack attributes of the decorated enemy.
 *
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class EnemyDecorator extends Enemy {

    // Attributes
    private final Enemy decoratedEnemy;
    private final int healthModifier;
    private final int attackModifier;

    /**
     * Constructs a new EnemyDecorator object with the specified decorated enemy,
     * health modifier, and attack modifier.
     *
     * @param decoratedEnemy  The enemy to be decorated.
     * @param healthModifier  The modifier to be applied to the health attribute.
     * @param attackModifier  The modifier to be applied to the attack attribute.
     */
    public EnemyDecorator(Enemy decoratedEnemy, int healthModifier, int attackModifier) {
        // Call the superclass constructor with the attributes of the decorated enemy
        super(decoratedEnemy.getType(), decoratedEnemy.getHealth(), decoratedEnemy.getAttack(), decoratedEnemy.getLevel());
        this.decoratedEnemy = decoratedEnemy;
        this.healthModifier = healthModifier;
        this.attackModifier = attackModifier;
    }

    // Override the getHealth() method to modify the health attribute
    @Override
    public int getHealth() {
        return super.getHealth() + healthModifier;
    }

    // Override the getAttack() method to modify the attack attribute
    @Override
    public int getAttack() {
        return super.getAttack() + attackModifier;
    }
}