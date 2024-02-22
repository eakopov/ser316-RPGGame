package skills;

/**
 * The Context class represents the context in which a specific strategy (skill) is used.
 * It holds a reference to a Strategy object and delegates the skill execution to that strategy.
 *
 * @author Elizabeth Akopov
 * @version 02.21.2024
 */
public class Context {
    private final Strategy strategy;

    /**
     * Constructs a Context object with a specific strategy.
     *
     * @param strategy The strategy (skill) to be used in this context.
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Executes the specified skill using the strategy associated with this context.
     *
     * @param skill The skill to be executed.
     */
    public void use(String skill) {
        strategy.skill(skill);
    }
}
