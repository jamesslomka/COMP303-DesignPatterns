package Iterator;

public class Driver {

    public static void main(String[] args) {
        Names namesRepository = new Names();

        Iterator iter = namesRepository.createIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
