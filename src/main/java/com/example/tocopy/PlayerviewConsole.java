package com.example.tocopy;

public class PlayerviewConsole implements Playerview{
    @Override
    public void showcurrentPlayer(String pname) { // TODO Wittner: sollte hier nicht nur ein Spielername übergeben werden?????
        System.out.println(pname);
    }
}
