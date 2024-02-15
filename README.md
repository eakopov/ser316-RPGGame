# RPG Game - SER 316
This will be the repository that contains the RPG Game for SER316, by EAkopov.

## Plan to Implement Design Patterns:

### Factory Method Pattern (Creational):
- The Factory Method Pattern will be used to create instances of character classes, races, and enemies in the game. Each factory method will encapsulate the creation logic for a specific type of object, allowing the game to create instances without knowing the exact class of the object being created. For example, we can have a CharacterFactory for creating different types of characters based on selected class and race, and an EnemyFactory for generating various types of enemies encountered in the game.
- [X] Character Factory
- [ ] Enemy Factory
- [ ] Item Factory

### Decorator Pattern (Structural):
- The Decorator Pattern will be used to enhance character skills or abilities, decorate items with additional attributes or effects, and apply temporary status effects during combat. Decorators will dynamically add new functionalities or modify behavior of existing objects at runtime, allowing for flexible customization of characters and items without altering their core functionality. For example, we can use decorators to enhance a character's attack skill with additional effects like critical strike chance, or decorate an item with attributes like increased damage or defense.

### Observer Pattern (Behavioral):
- The Observer Pattern will be used to notify game events such as cycle changes, changes in character stats or attributes, item usage, and status effect application. Observers will subscribe to specific events or subjects of interest and receive notifications when relevant changes occur. This will enable different components of the game to communicate and react to changes in a loosely coupled manner, improving the overall flexibility and maintainability of the game code.
- (subject to change)
