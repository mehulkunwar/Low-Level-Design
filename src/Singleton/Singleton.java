package Singleton;

// Singleton - When we want single instance for the entire application.
// Use cases - DB Connection, Config. properties etc.

public class Singleton {
    private Singleton(){}

    private static class Helper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return Helper.INSTANCE;
    }
}
