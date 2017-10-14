package lists.first;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kptox on 13.10.2017.
 */
public class AnotherDeckTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testIfSetOfCardsIsProper() throws Exception {
        Deck deck_32 = new Deck (32);
        Card testCard = new Card(Suits.DIAMONDS, Ranks.SEVEN);

        for (Card deckCard : deck_32.cards) {
            Assert.assertFalse(testCard.compareTo(deckCard) < 0);
        }
    }

    @Test
    public void testEmptyDeck() throws Exception {
        Deck deck = new Deck(0);

        Assert.assertNotNull(deck.cards);
    }

    @Test
    public void testIsTheRightSize() throws Exception {
        Deck deck = new Deck(52);

        Assert.assertTrue(deck.cards.size() == 52);
    }

}