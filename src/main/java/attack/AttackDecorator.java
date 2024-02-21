package attack;

import java.util.Random;

public class AttackDecorator implements Attack {
    private final int attack;
    private final Random random;
    private final double missChance;
    private final double critChance;

    public AttackDecorator(int attack, double missChance, double critChance) {
        this.attack = attack;
        this.random = new Random();
        this.missChance = missChance;
        this.critChance = critChance;
    }

    @Override
    public int performAttack() {
        if (random.nextDouble() < missChance) {
            System.out.println("Attack missed!");
            return 0; // Attack missed
        }

        int damage = attack;

        if (random.nextDouble() < critChance) {
            damage *= 2; // Crit damage (2x)
            System.out.println("Critical hit!");
        }

        return damage;
    }
}
