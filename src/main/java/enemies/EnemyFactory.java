package enemies;

public class EnemyFactory {

    int floor = Floor.getFloor();

    public Enemy createEnemy(String type) {
        int level = Floor.getFloor() * 2;
        switch (type.toLowerCase()) {
            case "goblin":
                return new Enemy("Goblin", 5, 2, floor);
            case "skeleton":
                return new Enemy("Skeleton", 10, 5, floor);
            case "orc":
                return new Enemy("Orc", 20, 10, floor);
            default:
                throw new IllegalArgumentException("Invalid enemy type: " + type);
        }
    }
}