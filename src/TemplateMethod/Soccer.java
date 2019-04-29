package TemplateMethod;

public class Soccer extends Game {
    @Override
    void initialize() {
        System.out.println("Soccer game started");
    }

    @Override
    void startPlay() {
        System.out.println("Soccer game playing started");
    }

    @Override
    void endPlay() {
        System.out.println("Soccer game ended");
    }
}
