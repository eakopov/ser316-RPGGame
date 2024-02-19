import attack.*;
import characters.*;
import characters.Character;
import enemies.Enemy;
import enemies.EnemyDecorator;
import enemies.EnemyFactory;
import enemies.Floor;

import java.util.Scanner;

public class Main {
    static Character character;
    static Inventory inventory;
    public static int floor;
    public static int totalHP;
    public static int totalMana;

    public static void main(String[] args) {
        floor = Floor.getFloor();
        Cycle.part = 1;
        Scanner scanner = new Scanner(System.in);
        EnemyFactory enemyFactory = new EnemyFactory();
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
            character = createCharacter(scanner);
            inventory = new Inventory();
            totalHP = character.getHealth();
            totalMana = character.getMana();

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

            System.out.println("Floor " + floor);
            System.out.println("Your turn, " + character.getName() + "!");
            Enemy enemy = enemyFactory.createEnemy("goblin");
            Attack enemyAttack = new AttackDecorator(enemy.getAttack(), 0.2, 0.1);
            System.out.println("You are unfortunately greeted by a nasty goblin, and you cannot escape this fight!");
            System.out.println("Let's test your wits and see what you've got, " + character.getName() + "!");
            while(!enemy.isDead()){
                System.out.println("1. Attack");
                System.out.println("2. Inventory");
                choice = scanner.nextInt();

                if(choice == 1){
                    Attack charAttack = new AttackDecorator(character.getAttack(), 0.05, 0.25); // Beginner's luck
                    int damage = charAttack.performAttack();
                    System.out.println(character.getName() + " does " + damage + " damage!");
                    enemy.setHealth(enemy.getHealth() - damage);

                    if(enemy.getHealth() > 0){
                        System.out.println("The " + enemy.getType() + " is not dead yet!");
                        System.out.println("The " + enemy.getType() + " attempts to attack.");
                        character.setHealth(character.getHealth() - enemyAttack.performAttack());
                    }
                } else if (choice == 2) {
                    System.out.println("Inventory is empty.");
                }
            }

            System.out.println("Congratulations on defeating the goblin! Welcome to the Dungeon Crawler game.");
            System.out.println("This is a turn-based dungeon game where you'll venture deeper into a cave,");
            System.out.println("and as you progress, you fight monsters, similar to the one you just defeated!");
            System.out.println("The difficulty will increase as you go, but you'll also gain access to cool potions, armor, and money.");
            System.out.println("When you exit the cave, you have the option to either visit the shop to purchase items or continue your journey into the cave.");

            menu();

//            if((double)character.getHealth() < (0.15 * (double)(totalHP))) {
//                character.setHealth(totalHP);
//                character.setMana(totalMana);
//
//                // Print player status
//                System.out.printf("\n%s Stats:\n", character.getName());
//                System.out.printf("%s is of %s height and %s weight. They have\n%s eyes and %s length hair that is %s in color.\n", character.getName(), character.getHeight(), character.getWeight(), character.getEyeColor(), character.getHairLength(), character.getHairColor());
//                System.out.println("Class: " + character.getCharacterClass());
//                System.out.println("Race: " + character.getCharacterRace());
//                System.out.println("XP: " + character.getXP());
//                System.out.println("Attack: " + character.getAttack());
//                System.out.println("Defense: " + character.getDefense());
//                System.out.println("Mana: " + character.getMana());
//                System.out.println("Speed: " + character.getSpeed());
//                System.out.println("Skill: " + character.getSkill());
//                System.out.println("Health: " + character.getHealth());
//                System.out.println();
//                System.out.println("Options:");
//                System.out.println("1. Cave");
//                System.out.println("2. Shop");
//                System.out.println("3. Exit");
//
//                // Prompt user for choice
//                System.out.print("Enter your choice: ");
//                int x = scanner.nextInt();
//
//
//            }
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

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("What will you choose?");
        System.out.println("1. Go to the Shop");
        System.out.println("2. Go into the Cave");
        System.out.println("3. Leave and never return (exit)");

        choice = scanner.nextInt();

        if(choice == 1){
            Shop.displayItems();
            choice = scanner.nextInt();
            if(choice == 5) {
                menu();
            }
        } else if(choice == 2) {
            int money = cave();
            inventory.addMoney(money);
            character.setHealth(totalHP);
            character.setMana(totalMana);
            menu();
        } else {
            System.exit(0);
        }
    }

    public static int cave() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int money = 0;
        double dying = character.getHealth() * 0.15;
        Floor.setFloor(1);
        Cycle.setPart(1);
        int count = 1;


        while(character.getHealth() > dying){
            EnemyFactory enemy = new EnemyFactory();
            if(Floor.getFloor() % 3 == 0) {
                int part = (Cycle.getPart() % 4) + 1;
                Cycle.setPart(part);
                System.out.println("Part Status Effect: " + Cycle.cycleEffect(part));
            }

            if(Floor.getFloor() == 100){
                //bossFight();
            }
            if(Floor.getFloor() % 10 == 0){
                Enemy orc = enemy.createEnemy("orc");
                AttackDecorator enemyAttack = new AttackDecorator(orc.getAttack(), 0.1, 0.25);
                AttackDecorator charAttack = new AttackDecorator(character.getAttack(), 0.25, 0.1);

                System.out.println("You've encountered an orc! They are the most difficult of them all.");
                display();
                choice = scanner.nextInt();

                while(!orc.isDead()) {
                    if (choice == 1) {

                    } else if (choice == 2) {

                    } else {
                        System.out.println("Error: invalid choice! Please choose either 1 or 2.");
                        display();
                    }
                }
            } else if (Floor.getFloor() % 5 == 0) {

            } else {

            }
            count++;
            Floor.setFloor(count);
            money += (count / 2);
        }
        return money;
    }

    public static void display() {
        System.out.println("---------------------");
        System.out.println("| FLOOR NUMBER: " + Floor.getFloor() + "   |");
        System.out.println("---------------------");
        System.out.println("Effect Status: " + Cycle.cycleEffect(Cycle.getPart()));
        System.out.println("Your health: " + character.getHealth());
        System.out.println("Your mana: " + character.getMana());
        System.out.println("What do you want to do?");
        System.out.println("1. Attack");
        System.out.println("2. Inventory");
    }
}
