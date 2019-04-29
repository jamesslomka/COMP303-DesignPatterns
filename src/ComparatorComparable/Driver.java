package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args){


        Card card = new Card(Card.Rank.TWO, Card.Suit.HEARTS);
        Card card2 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);

        List<Card> someCards = new ArrayList<>();
        someCards.add(card2);
        someCards.add(card);

        /** COMPARABLE EXAMPLES
         *     - Notice how it uses card's compareTo method, which compares rank
         */
        System.out.println("COMPARABLE");
        System.out.println("Before:   " + someCards.toString());
        Collections.sort(someCards);
        System.out.println("After: " + someCards.toString());


        /**
         *  COMPARATOR EXAMPLES
         *   - Illustrates that you can have multiple, distinct ways to compare
         *     and you can choose which one you'd like to use
         */

        System.out.println("\n\nRank Comparator");

        System.out.println("Before:   " + someCards.toString());
        Collections.sort(someCards,new RankFirstComparator());
        System.out.println("After: " + someCards.toString());

        System.out.println("\n\nSuit Comparator");

        System.out.println("Before:   " + someCards.toString());
        Collections.sort(someCards,new SuitFirstComparator());
        System.out.println("After: " + someCards.toString());


    }

}
