package TemplateMethodDP;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football game started");
    }

    @Override
    void startPlay() {
        System.out.println("Football game playing started");
    }

    @Override
    void endPlay() {
        System.out.println("Football game ended");
    }
}
