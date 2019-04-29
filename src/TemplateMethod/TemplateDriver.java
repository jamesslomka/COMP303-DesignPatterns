package TemplateMethod;

public class TemplateDriver {

    public static void main(String[] args){
        Game game = new Soccer();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
