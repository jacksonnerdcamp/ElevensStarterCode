package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args)
    {
        Card card1 = new Card("nine", "spades", 9);
        Card card2 = new Card("king", "hearts", 13);
        Card card3 = new Card("three", "diamonds", 3);

        System.out.println(card1.rank());
        System.out.println(card1.suit());
        System.out.println(card1.pointValue());

        System.out.println(card2.rank());
        System.out.println(card2.suit());
        System.out.println(card2.pointValue());

        System.out.println(card3.rank());
        System.out.println(card3.suit());
        System.out.println(card3.pointValue());
    }
}
