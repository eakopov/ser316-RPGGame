import characters.*;
import characters.Character;

import java.util.Scanner;

public class Main {
    public int floor;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display title card and options
        System.out.println("Welcome to the Dungeon Crawler Game!");
        System.out.println("Options:");
        System.out.println("1. Start Game");
        System.out.println("2. Exit");

        // Prompt user for choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Start character creation
            Character character = createCharacter(scanner);

            // Access specific properties of the character
            System.out.printf("\n%s Stats:\n", character.getName());
            System.out.printf("%s is of %s height and %s weight. They have\n%s eyes and %s length hair that is %s in color.\n", character.getName(), character.getHeight(), character.getWeight(), character.getEyeColor(), character.getHairLength(), character.getHairColor());
            System.out.println("Class: " + character.getCharacterClass());
            System.out.println("Race: " + character.getCharacterRace());
            System.out.println("XP: " + character.getXP());
            System.out.println("Attack: " + character.getAttack());
            System.out.println("Defense: " + character.getDefense());
            System.out.println("Mana: " + character.getMana());
            System.out.println("Speed: " + character.getSpeed());
            System.out.println("Skill: " + character.getSkill());
            System.out.println("Health: " + character.getHealth());


        } else if (choice == 2) {
            // Exit the game
            System.out.println("Exiting the game. Goodbye!");
            return;
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
            return;
        }

        scanner.close();
    }

    private static characters.Character createCharacter(Scanner scanner) {
        // Prompt user for character attributes
        System.out.println("\nCharacter Creation:");

        System.out.print("Enter character name: ");
        String name = scanner.next();

        System.out.print("Enter sex (Male/Female): ");
        String sex = scanner.next();

        System.out.print("Enter hair color (Brown/Blonde/Black/red): ");
        String hairColor = scanner.next();

        System.out.print("Enter hair length (None/Short/Medium/Long): ");
        String hairLength = scanner.next();

        System.out.print("Enter eye color (Green/Blue/Gray/Hazel): ");
        String eyeColor = scanner.next();

        System.out.print("Enter height (Short/Average/Tall): ");
        String height = scanner.next();

        System.out.print("Enter weight (Slim/Average/Large): ");
        String weight = scanner.next();

        System.out.print("Enter character class (Druid/Bard/Cleric/Paladin/Wizard): ");
        String characterClass = scanner.next();

        System.out.print("Enter character race (Human/Elf/Dwarf/Orc/Tiefling): ");
        String characterRace = scanner.next();

        // Create character using CharacterFactory
        CharacterFactory characterFactory = new CharacterFactory();
        return characterFactory.createCharacter(name, sex, hairColor, hairLength, eyeColor, height, weight, characterClass, characterRace);
    }

    public int getFloor() {
        return floor;
    }
}
