package skills;

public class CharSkill implements Strategy {

    @Override
    public void skill(String skill) {
        switch (skill) {
            case "Gains 2x money each fight won.":

                break;
            case "Recovers 2HP after every 5 floors.":

                break;
            case "+5 starting HP":

                break;
            case "+5 starting defense":

                break;
            case "+5 starting mana.":

                break;
            default:
                throw new IllegalArgumentException("Invalid skill");
        }
    }
}
