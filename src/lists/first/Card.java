package lists.first;

/**
 * Card class implements information and methods used to handle and describe
 * a single card.
 * @see Comparable
 */
public class Card implements Comparable<Card>{


    Ranks rank;
    Suits suit;

    /**
     * Set up basic information about a card.
     * @param suit Suit of the card to set
     * @param rank Rank of the card to set
     */
    public Card (Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Override inherited method and return stored information
     *
     * @see Object#toString()
     *
     * @return String description of a card
     */
    public String toString() {
        return rank.name() + " OF " + suit.name();
    }

    /**
     * Implement method used for comparison in order to make cards comparable objects.
     *
     * @see Comparable#compareTo(Object)
     *
     * @param o Another card to compare.
     * @return Integer value depending on the outcome of comparison.
     */
    public int compareTo(Card o) {
        if (this.rank.equals(o.rank))
            return this.suit.compareTo(o.suit);
        else
            return this.rank.compareTo(o.rank);

    }
}
