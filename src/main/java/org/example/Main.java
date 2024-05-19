package org.example;

public class Main {
    public static void main(String[] args) {
        Starwars move_Starwars = new Starwars();
        System.out.printf("year: %s, director: %s, translated: %s",move_Starwars.getYear(),move_Starwars.getDirector(),move_Starwars.getTranslated() );
    }
}