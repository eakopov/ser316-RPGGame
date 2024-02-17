package enemies;

public class EnemyDecorator extends Enemy {
    private Enemy decoratedEnemy;
    private int healthModifier;
    private int attackModifier;

    public EnemyDecorator(Enemy decoratedEnemy, int healthModifier, int attackModifier) {
        super(decoratedEnemy.getType(), decoratedEnemy.getHealth(), decoratedEnemy.getAttack(), decoratedEnemy.getLevel());
        this.decoratedEnemy = decoratedEnemy;
        this.healthModifier = healthModifier;
        this.attackModifier = attackModifier;
    }

    @Override
    public int getHealth() {
        return super.getHealth() + healthModifier;
    }

    @Override
    public int getAttack() {
        return super.getAttack() + attackModifier;
    }
}