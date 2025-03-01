## Overview
This Java program simulates a standard deck of 52 playing cards and provides various operations to interact with it. The program follows an **object-oriented approach**, using separate classes for **Card**, **Deck**, and **Main**, with additional compiled class files generated after execution. It implements a **menu-driven system** where users can perform different card operations such as printing, shuffling, comparing, searching, and dealing cards.

## Features
- **Create a deck of 52 cards** (Automatically initialized in `Deck` constructor).
- **Print all cards** in the deck.
- **Print a random card** from the deck.
- **Find a specific card** by rank and suit.
- **Get a random card from a specified suit**.
- **Compare two cards** based on rank.
- **Deal five random cards** from the deck.
- **Shuffle the deck** to randomize the order of cards.
- **User-friendly menu** for easy interaction.

## Prerequisites
- **Java Development Kit (JDK) 8 or later**
- A Java-compatible IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal for command-line execution

## Installation and Execution
### **Step 1: Clone or Download the Repository**
```
git clone https://github.com/your-repository/java-card-deck.git
```
Alternatively, download the source files manually.

### **Step 2: Compile the Java Files**
Navigate to the project directory and compile the Java files using:
```
javac Main.java
```

### **Step 3: Run the Program**
After successful compilation, run the program with:
```
java Main
```

## File Structure
```
|-- src/
|   |-- Main.java   # Contains the main method and menu-driven user interaction
|   |-- Card.java   # Represents a single playing card with rank and suit
|   |-- Deck.java   # Handles deck creation, shuffling, searching, and other operations
|-- bin/
|   |-- Main.class  # Compiled bytecode for Main
|   |-- Card.class  # Compiled bytecode for Card
|   |-- Deck.class  # Compiled bytecode for Deck
|-- README.md       # Documentation file
|-- LICENSE         # MIT License file
```

## Program Explanation
### **1. Card.java**
This class represents an individual card in the deck. Each card has:
- A **rank** (2-10, Jack, Queen, King, Ace)
- A **suit** (Clubs, Diamonds, Spades, Hearts)
- A **constructor** to initialize rank and suit
- A **toString()** method to return a formatted string representation

### **2. Deck.java**
This class manages the deck and implements various operations, including:
- **createDeck()** → Initializes a 52-card deck.
- **printDeck()** → Prints all cards in the deck.
- **printCard()** → Displays a random card.
- **shuffleDeck()** → Randomizes the deck order.
- **sameCard(Scanner sc)** → Returns a random card from a user-specified suit.
- **compareCard(Scanner sc)** → Asks for two cards and compares their rank.
- **findCard(Scanner sc)** → Searches for a specific card by rank and suit.
- **dealCard()** → Prints five randomly selected cards.

### **3. Main.java**
This is the entry point of the program, containing:
- A **menu-driven system** for user interaction
- A **Scanner object** for user input
- A loop to **execute operations** until the user exits

## Example Usage
```
----- MENU -----
1. Print Deck
2. Print a Random Card
3. Find a Specific Card
4. Get a Random Card from a Suit
5. Compare Two Cards by Rank
6. Deal 5 Random Cards
7. Shuffle Deck
8. Exit
Enter your choice: 3

Enter rank: Queen
Enter suit: Hearts
Card found: Queen of Hearts
```

## Coding Best Practices Followed
- **Object-Oriented Design** → Encapsulation using separate classes for Card and Deck.
- **Efficient Data Handling** → ArrayList used for dynamic storage.
- **Modular and Readable Code** → Each operation is a separate method.
- **Proper Exception Handling** → Validations for user input.
- **Code Documentation** → Meaningful comments for better understanding.

## License
This project is licensed under the **MIT License**. See the **LICENSE** file for more details.

## Conclusion
This Java program provides a fully functional deck of cards with various operations for simulation. It follows a clean and modular coding approach, making it easy to maintain and expand.
