package PolymorphicCopying;

import java.util.ArrayList;

/**
 * Midterm Question 1b)
 *
 */
public class Menu implements Cloneable {

    ArrayList<Items> aItems;

    @Override
    public Menu clone(){

        Menu clone;

        try{
            clone = (Menu) super.clone();
            clone.aItems = new ArrayList<Items>();
            return clone;
        }
        catch(CloneNotSupportedException e){
            return  null;
        }
    }
}
