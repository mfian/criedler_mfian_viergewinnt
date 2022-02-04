package com.example.tocopy;

public class PlayerviewConsole implements Playerview{
    @Override
    public void showcurrentPlayer(Game g) { // TODO Wittner: sollte hier nicht nur ein Spielername übergeben werden?????
        System.out.println(g.currentplayer.toString());
    }
}
