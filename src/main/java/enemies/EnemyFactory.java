package enemies;

public class EnemyFactory {
    public Enemy createEnemy(String type) {
        switch (type.toLowerCase()) {
            case "goblin":
                return new Enemy("Goblin", 50, 10);
            case "skeleton":
                return new Enemy("Skeleton", 30, 15);
            case "orc":
                return new Enemy("Orc", 70, 20);
            default:
                throw new IllegalArgumentException("Invalid enemy type: " + type);
        }
    }
}