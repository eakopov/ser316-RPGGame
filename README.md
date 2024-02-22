# RPG Game - SER 316
This repository contains the RPG Game developed for SER316 by EAkopov.

## Overview:
This game emulates a standard RPG Dungeon Crawler. When the game starts, you get to choose to start the game or to exit.
From there, you are able to create a character, choosing your character's class (Bard, Cleric, Druid, Paladin, and Wizard),
your character's race (Human, Tiefling, Orc, Elf, and Dwarf), their sex, height, and weight (all modify stats).
After this, you encounter a goblin who you must fight! Once completing this fight, you are officially an adventurer. You
may choose to enter the cave, where there are floors of enemies. Each floor is harder than the last, each 5th floor has a
medium boss, and each tenth floor has a large boss. At the 100th floor, you encounter the final boss, to which if you win,
you win the entire game!
Outside of the cave, you are able to enter the shop where you can spend money you earn in the cave to buy potions and armor.
Armor consists of either helmets, boots, or a shield. Potions consist of either health or mana potions. All items can come
in good, fair, or poor condition, determining their effect status.
You are able to access your inventory both in and out of the cave. During combat, you can use potions to restore health and
mana. Outside of the cave, you can choose what armor to equip.

## Design Patterns:

### Factory Method Pattern (Creational):
- **Utilization**: The Factory Method Pattern is employed to create instances of character classes, races, and enemies in the game.
- **Why**: This pattern encapsulates the creation logic for specific types of objects, enabling the game to create instances without knowing the exact class of the object being created. It provides flexibility and extensibility for adding new character types and enemies in the future.
- **Implementation**: Implemented in classes like `CharacterFactory`, `EnemyFactory`, `ItemFactory`, and `ArmorFactory`, each factory method creates instances of respective objects based on specific parameters.

### Decorator Pattern (Structural):
- **Utilization**: The Decorator Pattern enhances character skills or abilities, decorates items with additional attributes or effects, and applies temporary status effects during combat.
- **Why**: This pattern dynamically adds new functionalities or modifies the behavior of existing objects at runtime, allowing for flexible customization of characters and items without altering their core functionality.
- **Implementation**: Implemented in classes like `AttackDecorator` and `EnemyDecorator`, decorators enhance or modify the behavior of attacks, enemy characteristics, and item effects during gameplay.

### Strategy Pattern (Behavioral):
- **Utilization**: The Strategy Pattern manages immediate actions during gameplay, including defining diverse combat behaviors for enemies and encapsulating the effects of various potions.
- **Why**: This pattern organizes and customizes combat mechanics and item interactions efficiently, allowing for easy addition of new strategies and behaviors without modifying existing code.
- **Implementation**: Implemented in classes like `CharSkill` and `PartSkill`, different strategies are encapsulated to handle diverse combat behaviors for characters and enemies, as well as the effects of various potions during gameplay.

## Sources:
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.
