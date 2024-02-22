package items;

/**
 * The ArmorFactory class is responsible for creating instances of different armor items.
 * It contains a method to create an armor item based on the provided name and condition.
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class ArmorFactory {

    /**
     * Creates an armor item based on the provided name and condition.
     *
     * @param armorName      The name of the armor item.
     * @param armorCondition The condition of the armor item.
     * @return The created armor item.
     */
    public Armor createArmor(String armorName, String armorCondition) {
        switch (armorName.toLowerCase()) {
            case "helmet":
                return new Helmet(armorCondition);
            case "boots":
                return new Boots(armorCondition);
            case "shield":
                return new Shield(armorCondition);
            default:
                throw new IllegalArgumentException("Invalid armor type: " + armorName);
        }
    }
}
