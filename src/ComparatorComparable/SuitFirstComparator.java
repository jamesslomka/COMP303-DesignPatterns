package ComparatorComparable;

import java.util.Comparator;

/**
 *  COMPARATOR allows for custom ordering and comparison
 *
 */

public class SuitFirstComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o1.getSuit().compareTo(o2.getSuit());
    }
}
