package ObserverDP;

public class ObserverDriver {

    public static void main(String[] args){
        Model model = new Model();

        new OctalObserver(model);
        new BinaryObserver(model);

        System.out.println("First state change");

        model.setState(15);
        System.out.println("Second");
        model.setState(10);
    }
}
