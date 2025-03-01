// Class representing a single card
class Card {
    String rank; // Rank of the card (2-10, Jack, Queen, King, Ace)
    String suit; // Suit of the card (Clubs, Diamonds, Spades, Hearts)

    // Constructor to initialize a card with given rank and suit
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // String representation of the card
    public String toString() {
        return rank + " of " + suit;
    }
}
