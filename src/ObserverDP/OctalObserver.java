package ObserverDP;

public class OctalObserver extends Observer{

    public OctalObserver(Model model){
        this.model = model;
        this.model.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Binary String: " + Integer.toOctalString(model.getState()));
    }
}
