package attack;

import java.util.Random;

/**
 * AttackDecorator class implements the Attack interface and represents
 * an attack with additional decorator functionalities such as miss chance
 * and critical hit chance.
 */
public class AttackDecorator implements Attack {
    private final int attack; // Base attack damage
    private final Random random; // Random number generator for calculating chances
    private final double missChance; // Chance of missing the attack
    private final double critChance; // Chance of a critical hit

    /**
     * Constructor for AttackDecorator.
     *
     * @param attack     The base attack damage.
     * @param missChance The chance of missing the attack.
     * @param critChance The chance of a critical hit.
     */
    public AttackDecorator(int attack, double missChance, double critChance) {
        this.attack = attack;
        this.random = new Random();
        this.missChance = missChance;
        this.critChance = critChance;
    }

    /**
     * Performs the attack, considering miss and critical hit chances.
     *
     * @return The damage dealt by the attack.
     */
    @Override
    public int performAttack() {
        // Check if the attack misses
        if (random.nextDouble() < missChance) {
            System.out.println("Attack missed!");
            return 0; // Attack missed
        }

        int damage = attack; // Initialize damage with the base attack value

        // Check if the attack results in a critical hit
        if (random.nextDouble() < critChance) {
            damage *= 2; // Double the damage for a critical hit
            System.out.println("Critical hit!");
        }

        return damage; // Return the final damage dealt by the attack
    }
}
