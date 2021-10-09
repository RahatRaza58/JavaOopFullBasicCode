package oop;

public interface Showable {
    void show();

    default void  text()
    {
        System.out.println("Texting");

    }
}
