

public class Card implements Comparable<Card>{

    Ranks rank;
    Suits suit;

    public Card (Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank.name() + " OF " + suit.name();
    }

    @Override
    public int compareTo(Card o) {
        if (this.rank.equals(o.rank))
            return this.suit.compareTo(o.suit);
        else
            return this.rank.compareTo(o.rank);

    }
}
