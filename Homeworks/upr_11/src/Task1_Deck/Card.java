package Task1_Deck;

import Task0_Cards.Task0_Cards;

public class Card extends Task0_Cards implements Comparable<Card> {

    private CardSuit[] suit;
    private CardRank[] rank;

    Card(CardSuit suit[], CardRank rank[]) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (CardSuit s : CardSuit.values())
            for (CardRank r : CardRank.values())
                str.append(r).append(" of ").append(s).append("\n");
        return str.toString();
    }


    public CardRank[] getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card o) {
        int result = 0;
        for (int i = 0; i < rank.length - 1; i++)
            if ( (CardRank.values()[i].compareTo( CardRank.values()[i + 1])) > 0)
                result = 1;
            else result = -1;
        return result;
    }
}
