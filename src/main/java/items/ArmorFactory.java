package items;

public class ArmorFactory {

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
