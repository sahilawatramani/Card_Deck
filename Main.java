// Name: [Your Name]
// PRN: [Your PRN]
// Batch: [Your Batch]

// Importing Scanner for user input
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck(); // Automatically creates the deck

        int choice;
        do {
            // Display menu options
            System.out.println("\n----- MENU -----");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Random Card");
            System.out.println("3. Find a Specific Card");
            System.out.println("4. Get a Random Card from a Suit");
            System.out.println("5. Compare Two Cards by Rank");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            // Perform the selected operation
            switch (choice) {
                case 1: deck.printDeck(); break;
                case 2: deck.printCard(); break;
                case 3: deck.findCard(sc); break;
                case 4: deck.sameCard(sc); break;
                case 5: deck.compareCard(sc); break;
                case 6: deck.dealCard(); break;
                case 7: deck.shuffleDeck(); break;
                case 8: System.out.println("Exiting program..."); break;
                default: System.out.println("Invalid choice, try again.");
            }
        } while (choice != 8);
    }
}
