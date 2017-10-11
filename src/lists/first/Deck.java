package lists.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Suits {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS;
}

enum Ranks {
    KING, QUEEN, JACK, TEN,
    NINE, EIGHT, SEVEN ,SIX,
    FIVE, FOUR, THREE, TWO,
    ACE;
}

public class Deck {

    List<Card> cards;

    public Deck(int amount) {
        cards = new ArrayList<Card>();

        for (Ranks rank : Ranks.values()) {
            for (Suits suit : Suits.values()) {
                if (cards.size() >= amount)
                    break;
                cards.add(new Card (suit, rank));
            }
        }
        showDeck();
        shuffleDeck();
        showDeck();
        sortDeck();
        showDeck();
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public void sortDeck() {
        Collections.sort(cards);
    }

    public void showDeck() {
        for (Card card : cards) {
            System.out.println (card.toString());
        }
        System.out.println();
    }

    public Card showTopCard() {
        return cards.get(cards.size() - 1);
    }

    public static void main(String[] args) {
        Deck deck = new Deck(52);
    }

}
