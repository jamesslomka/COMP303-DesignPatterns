package Singleton;

public class Driver {

    public static void main(String[] args){
        SingleObject obj =  SingleObject.getInstance();
        obj.showMsg();
    }
}
