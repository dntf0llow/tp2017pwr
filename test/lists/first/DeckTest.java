package lists.first;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


public class DeckTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testShuffleDeck() throws Exception {
        Deck deck = new Deck(52);

        ArrayList<Card> tmpCards = new ArrayList<Card>();
        tmpCards.addAll(deck.cards);

        deck.shuffleDeck();
        Assert.assertFalse(tmpCards.equals(deck.cards));
    }

    public void testIfSetOfCardsIsProper() throws Exception {
        Deck deck_32 = new Deck (32);
        Card testCard = new Card(Suits.DIAMONDS, Ranks.SEVEN);

        for (Card deckCard : deck_32.cards) {
            Assert.assertFalse(testCard.compareTo(deckCard) < 0);
        }

    }

    public void testEmptyDeck() throws Exception {
        Deck deck = new Deck(0);

        Assert.assertNotNull(deck.cards);
    }

    public void testIsTheRightSize() throws Exception {
        Deck deck = new Deck(52);

        Assert.assertTrue(deck.cards.size() == 52);
    }

    public void testSortDeck() throws Exception {

    }

    public void testShowTopCard() throws Exception {

    }
}