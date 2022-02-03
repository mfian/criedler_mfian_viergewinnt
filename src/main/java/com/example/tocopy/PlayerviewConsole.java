package com.example.tocopy;

public class PlayerviewConsole implements Playerview{
    @Override
    public void showcurrentPlayer(Game g) {
        System.out.println(g.currentplayer);
    }
}
