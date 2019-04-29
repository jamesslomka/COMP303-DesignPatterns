package ComparatorComparable;

import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o1.getRank().compareTo(o2.getRank());
    }
}
