# RPG Game - SER 316
This will be the repository that contains the RPG Game for SER316, by EAkopov.

## Plan to Implement Design Patterns:

### Factory Method Pattern (Creational):
- The Factory Method Pattern will be used to create instances of characters classes, races, and enemies in the game. Each factory method will encapsulate the creation logic for a specific type of object, allowing the game to create instances without knowing the exact class of the object being created.

### Decorator Pattern (Structural):
- The Decorator Pattern will be used to enhance characters skills or abilities, decorate items with additional attributes or effects, and apply temporary status effects during combat. Decorators will dynamically add new functionalities or modify behavior of existing objects at runtime, allowing for flexible customization of characters and items without altering their core functionality.

### Strategy Pattern (Behavioral):
- The Strategy Pattern will be utilized to manage immediate actions during gameplay, including defining diverse combat behaviors for enemies and encapsulating the effects of various potions. By leveraging this design pattern, the game's combat mechanics and item interactions can be efficiently organized and customized.