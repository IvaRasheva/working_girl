package Task0_Cards;

import static Task0_Cards.Task0_Cards.CardRank.Ace;
import static Task0_Cards.Task0_Cards.CardSuit.Spades;

public class Task0_Cards {
    public static void main(String[] args) {

        for (CardSuit s : CardSuit.values()){
            if (s.equals(Spades))
                System.out.print(s + "\n");
            else
            System.out.print(s + ", ");
        }

        for (CardRank r : CardRank.values()){
            if (r.equals(Ace))
                System.out.print(r + "\n");
            else
            System.out.print(r + ", ");
        }
    }

    public enum CardSuit{
        Clubs,
        Diamonds,
        Hearts,
        Spades
    }

    public enum CardRank {
        Two(2),
        Three(3),
        Four(4),
        Five(5),
        Six(6),
        Seven(7),
        Eight(8),
        Nine(9),
        Ten(10),
        Jack(11),
        Queen(12),
        King(13),
        Ace(14);

        private final int value;

        CardRank(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
}
