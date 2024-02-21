package skills;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void use(String skill) {
        strategy.skill(skill);
    }
}
