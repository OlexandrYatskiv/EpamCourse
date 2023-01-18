

public class Card {

    static final int ACE = 1;
    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static  final int FIVE = 5;
    static final int SIX = 6;
    static  final int SEVEN = 7;
    static  final int EIGHT = 8;
    static  final int NINE = 9;
    static  final int TEN = 10;
    static  final int JACK = 11;
    static  final int QUEEN = 12;
    static final int KING = 13;

    static  final int DIAMONDS = 1;
    static final int HEARTS = 2;
    static final int CLUBS  = 3;
    static  final int SPADES = 4;

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }


    int rank;
    int suit;

    public Card(int rank, int suit) {
        assert(isTrueRank());
        assert (isTrueSuit());
        this.rank = rank;
        this.suit = suit;
    }

  public  boolean isTrueSuit()
    {
        if(suit <=1 && 4>=suit)
        {
            return true;
        }
        return false;
    }
    public  boolean isTrueRank()
    {
        if(rank <=1 && 13>=rank)
        {
            return true;
        }
        return false;
    }
    public  String rankToString(int rank)
    {
        switch (rank)
        {
            case ACE:
                return "Ace";
            case TWO:
                return "Two";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return null;
        }
    }
    public static String suitToString(int suit)
    {
        switch (suit)
        {
            case DIAMONDS:
                return "Diamonds";
            case HEARTS:
                return "Hearts";
            case CLUBS:
                return "Clubs";
            case SPADES:
                return "Spades";
            default:
                return null;
        }

    }
}
