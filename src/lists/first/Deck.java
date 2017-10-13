package lists.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Enumeration of all possible suits.
 */
enum Suits {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS;
}

/**
 * Enumeration of all possible ranks.
 */
enum Ranks {
    ACE,
    KING, QUEEN, JACK, TEN,
    NINE, EIGHT, SEVEN ,SIX,
    FIVE, FOUR, THREE, TWO;
}

/**
 * Deck class implements methods used for managing a set of cards and also
 * stores all the information about cards.
 *
 * @see Card
 *
 * @author dntf0llow
 */
public class Deck {

    // Array of all possible cards in the deck.
    ArrayList<Card> cards;

    /**
     * Constructor of the class, creates an array to store cards
     * and puts cards inside.
     *
     * @param amount Amount of cards in the deck.
     */
    public Deck(int amount) {
        cards = new ArrayList<Card>();

        // Creates cards starting from the highest rank.
        for (Ranks rank : Ranks.values())
            for (Suits suit : Suits.values()) {
                if (cards.size() >= amount)
                    break;
                cards.add(new Card (suit, rank));
            }

    }

    /**
     * Shuffle cards in the deck, using predefined method.
     * @see java.util.Collections#shuffle(List)
     */
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    /**
     * Sort cards in the deck, using predefined method.
     * @see java.util.Collections#sort(List)
     */
    public void sortDeck() {
        Collections.sort(cards);
    }

    /**
     * Print out all cards in the deck using predefined method in Card class.
     * @see Card#toString()
     */
    public void showDeck() {
        for (Card card : cards) {
            System.out.println (card.toString());
        }
        System.out.println();
    }

//    public static void main(String[] args) {
//        Deck deck = new Deck(32);
//        deck.showDeck();
//    }

    /**
     *
     * @return card on the top of the deck
     */
    public Card showTopCard() {
        return cards.get(cards.size() - 1);
    }
}
