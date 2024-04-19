import java.util.Random;

public class RandomCardsV2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
            String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
                    "King", "Ace" };

            String suit = suits[new Random().nextInt(suits.length)];
            String rank = ranks[new Random().nextInt(ranks.length)];

            System.out.println(rank + " of " + suit);
        }
    }
}
