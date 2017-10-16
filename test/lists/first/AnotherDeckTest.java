package lists.first;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyDeck() throws Exception {
        Deck deck = new Deck(0);

        Assert.assertNotNull(deck.cards);
        deck.cards.get(0);
    }
    @Test(timeout = 200)
    public void testIsTheRightSize() throws Exception {
        Deck deck = new Deck(52);

        Assert.assertTrue(deck.cards.size() == 52);
    }

    @Ignore("Example use of ignore")
    @Test
    public void testTopCardShowed() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

}