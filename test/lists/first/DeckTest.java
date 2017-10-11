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

        Assert.assertNotSame(tmpCards, deck.cards);
    }

    public void testSortDeck() throws Exception {

    }

    public void testShowDeck() throws Exception {

    }

    public void testShowTopCard() throws Exception {

    }

    public void testIsTheRightSize() throws Exception {

    }

}