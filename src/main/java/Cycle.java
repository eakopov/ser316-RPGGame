public class Cycle {
    public static int part;

    public static int getPart() {
        return part;
    }

    public static void setPart(int part) {
        Cycle.part = part;
    }

    public String cycleEffect(int part) {
        String effect = "";

        if(part == 1) {
            effect = "Gain 2x money!";
        }
        if(part == 2) {
            effect = "HP decreased by 2!";
        }
        if(part == 3) {
            effect = "Extra enemies!";
        }
        if(part == 4){
            effect = "Attack increased by 2!";
        }
        return effect;
    }
}
