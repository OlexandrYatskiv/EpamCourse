
enum Rank {
    ACE(1),TWO(2),THREE(3),FOUR(4),FIVE (5),SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int i;
    Rank(int rank) {
        this.i = i;
    }
}

enum Suit {
    DIAMONDS(1), HEARTS(2), CLUBS(3), SPADES(4);
    private int i;

    Suit(int suit) {
        this.i = i;
    }

}
public class Card {
        private final Suit suit;
    private final  Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }


}




