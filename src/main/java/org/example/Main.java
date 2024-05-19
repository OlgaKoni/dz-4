package org.example;

public class Main {
    public static void main(String[] args) {
        Starwars film_Starwars = new Starwars();
        System.out.printf("year: %s, director: %s, translated: %s",film_Starwars.getYear(),film_Starwars.getDirector(),film_Starwars.getTranslated() );
    }
}