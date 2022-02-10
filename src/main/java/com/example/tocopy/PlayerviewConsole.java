package com.example.tocopy;

/**
 * Ausgabe über den Spieler an der Konsole
 */
public class PlayerviewConsole implements Playerview{
    @Override
    public void showcurrentPlayer(String pname) { // TODO Wittner: sollte hier nicht nur ein Spielername übergeben werden?????
        System.out.println(pname);
    }
}
