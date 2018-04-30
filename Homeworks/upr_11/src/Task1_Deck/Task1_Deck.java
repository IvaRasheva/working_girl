package Task1_Deck;

import Task0_Cards.Task0_Cards.CardRank;
import Task0_Cards.Task0_Cards.CardSuit;

public class Task1_Deck {
    public static void main(String[] args) {

        Card c = new Card(CardSuit.values(), CardRank.values());
        System.out.println(c);
    }
}
