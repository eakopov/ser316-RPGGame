/**
 * The Cycle class represents the cycle of effects in the game, providing methods to retrieve
 * the current part and determine the effect based on the current part.
 *
 * @author Elizabeth AKopov
 * @version 02.17.2024
 */
public class Cycle {
    // Static variable to store the current part of the cycle
    public static int part;

    /**
     * Retrieves the current part of the cycle.
     *
     * @return The current part of the cycle.
     */
    public static int getPart() {
        return part;
    }

    /**
     * Sets the current part of the cycle.
     *
     * @param part The part of the cycle to set.
     */
    public static void setPart(int part) {
        Cycle.part = part;
    }

    /**
     * Determines the effect based on the current part of the cycle.
     *
     * @param part The current part of the cycle.
     * @return The effect corresponding to the current part of the cycle.
     */
    public static String cycleEffect(int part) {
        String effect = "";

        // Determine the effect based on the current part of the cycle
        if (part == 1) {
            effect = "Gain 2x money!";
        }
        if (part == 2) {
            effect = "HP decreased by 2!";
        }
        if (part == 3) {
            effect = "Extra enemies!";
        }
        if (part == 4) {
            effect = "Attack increased by 2!";
        }
        return effect;
    }
}
