package Observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(Model model){
        this.model = model;
        this.model.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Binary String: " + Integer.toBinaryString(model.getState()));
    }
}
