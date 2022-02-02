package com.example.tocopy;

import java.util.Scanner;

public class Game {
    Player players;
    Playfield pfield;
    Player currentplayer;

    Player getstarter(Player p1, Player p2){
        int k;
        k = (int) ((Math.random()*(1))+0);
        if(k==0){
            return p1;
        }else{
            return p2;
        }
    }
    void restart(){
        int k;
        System.out.println("Spiel erneut starten?");
        System.out.println("0---Nein");
        System.out.println("1---Ja");
        Scanner scan = new Scanner(System.in);
        k= scan.nextInt();


    }
}
