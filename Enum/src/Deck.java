import java.util.*;

public class Deck {
    private static Card[] cards = new Card[52];

    public Deck() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card(suit, rank);

            }
        }

    }
    public void getCard() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.println(suit + " " + rank);
            }
        }
    }





}





