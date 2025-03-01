// Importing necessary libraries
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

// Class representing a deck of 52 playing cards
class Deck {
    ArrayList<Card> deck; // List to store the deck of cards

    // Constructor to initialize the deck and create cards
    public Deck() {
        this.deck = new ArrayList<>();
        createDeck(); // Automatically creates the deck when object is instantiated
    }

    // Method to create a standard deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

        // Loop through all ranks and suits to create 52 cards
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to print all cards in the deck
    public void printDeck() {
        System.out.println("-----DECK-----");
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to print a random card from the deck
    public void printCard() {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty!");
            return;
        }
        System.out.println("Random Card: " + deck.get(new Random().nextInt(deck.size())));
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        System.out.println("-----Shuffling Deck-----");
        Collections.shuffle(deck);
    }

    // Method to find a random card from a specific suit
    public void sameCard(Scanner sc) {
        System.out.print("Enter suit (Clubs, Diamonds, Spades, Hearts) to get a random card from it: ");
        String suit = sc.nextLine();
        ArrayList<Card> suitCards = new ArrayList<>();

        // Find all cards that belong to the chosen suit
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                suitCards.add(card);
            }
        }

        // If no cards of the suit exist, inform the user
        if (suitCards.isEmpty()) {
            System.out.println("No cards found for suit " + suit);
        } else {
            // Select a random card from the suit and display it
            Card randomCard = suitCards.get(new Random().nextInt(suitCards.size()));
            System.out.println("Random card from " + suit + ": " + randomCard);
        }
    }

    // Method to compare two cards based on their rank
    public void compareCard(Scanner sc) {
        System.out.print("Enter rank of first card: ");
        String rank1 = sc.nextLine();
        System.out.print("Enter suit of first card: ");
        String suit1 = sc.nextLine();
        System.out.print("Enter rank of second card: ");
        String rank2 = sc.nextLine();
        System.out.print("Enter suit of second card: ");
        String suit2 = sc.nextLine();

        // Compare ranks of the two selected cards
        if (rank1.equalsIgnoreCase(rank2)) {
            System.out.println("Both cards have the same rank.");
        } else {
            System.out.println("Cards have different ranks.");
        }
    }

    // Method to find if a specific card exists in the deck
    public void findCard(Scanner sc) {
        System.out.print("Enter rank: ");
        String rank = sc.nextLine();
        System.out.print("Enter suit: ");
        String suit = sc.nextLine();

        // Check if the given card exists in the deck
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

    // Method to print 5 random cards from the deck
    public void dealCard() {
        System.out.println("-----Dealing 5 Random Cards-----");
        Random rand = new Random();

        // Pick and display 5 random cards without removing them from the deck
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(rand.nextInt(deck.size())));
        }
    }
}
