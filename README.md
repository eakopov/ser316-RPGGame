# RPG Game - SER 316
This repository contains the RPG Game developed for SER316 by EAkopov.

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
- The Factory Method Pattern, Decorator Pattern, and Strategy Pattern implementations in this project are based on the design patterns outlined in "Design Patterns: Elements of Reusable Object-Oriented Software" by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.
