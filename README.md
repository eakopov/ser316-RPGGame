# RPG Game - SER 316
This will be the repository that contains the RPG Game for SER316, by EAkopov.

## Plan to Implement Design Patterns:

### Factory Method Pattern (Creational):
- The Factory Method Pattern will be used to create instances of characters classes, races, and enemies in the game. Each factory method will encapsulate the creation logic for a specific type of object, allowing the game to create instances without knowing the exact class of the object being created. For example, we can have a characters.CharacterFactory for creating different types of characters based on selected class and race, and an EnemyFactory for generating various types of enemies encountered in the game.

### Decorator Pattern (Structural):
- The Decorator Pattern will be used to enhance characters skills or abilities, decorate items with additional attributes or effects, and apply temporary status effects during combat. Decorators will dynamically add new functionalities or modify behavior of existing objects at runtime, allowing for flexible customization of characters and items without altering their core functionality. For example, we can use decorators to enhance a characters's attack skill with additional effects like critical strike chance, or decorate an item with attributes like increased damage or defense.

### Observer Pattern (Behavioral):
- The Decorator Pattern will be used to enhance characters skills or abilities, decorate items with additional attributes or effects, and apply temporary status effects during combat. Decorators will dynamically add new functionalities or modify behavior of existing objects at runtime, allowing for flexible customization of characters and items without altering their core functionality. For example, we can use decorators to enhance a characters's attack skill with additional effects like critical strike chance, or decorate an item with attributes like increased damage or defense.
