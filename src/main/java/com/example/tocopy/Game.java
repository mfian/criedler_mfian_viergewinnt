package com.example.tocopy;

import java.util.Scanner;
/*--------------------------------------------------------
 *      Hoehere Technische Bundeslehranstalt STEYR
 *------------------------------------------------------*/
/**
 * @author  : Constantin Riedler
 *            3AHITN
 * @date    : 03 Februar 2022, 10:30
 * File:   Game.java
 *
 * @details
 *   Game Klasse. Es können Spieler, Spielfelder und der aktuelle
 */
public class Game {
    Player player1;
    Player player2;

    Playfield pfield;
    Player currentplayer;

    /**
     * Konstrukter der Game Klasse
     * @param player1 1.Spieler
     * @param player2 2.Spieler
     * @param pfield feld das gesetzt werden soll
     */
    Game(Player player1,Player player2, Playfield pfield) {
        this.player1=player1;
        this.player2=player2;
        this.pfield=pfield;
    }





    /**
     * Generiert eine zufällige Zahl von 0-1 und überprüft dieses Ergebnis dann
     * @param p1 Einer der möglichen Beginner
     * @param p2 Einer der möglichen Beginner
     * @return Welcher der beiden Spieler beginnen darf
     */
    Player getstarter(Player p1, Player p2){
        int k;
        k = (int) ((Math.random()*(1))+0);
        if(k==0){
            return p1;
        }else{
            return p2;
        }
    }

    /**
     * Fragt den Benutzer ob das Spiel neugestartet werden soll und liest die Antwort darauf ein
     * @return ob das Spiel neugestartet werden soll oder nicht.
     */
    int restart(){
        int k;
        System.out.println("Spiel erneut starten?");
        System.out.println("0---Nein");
        System.out.println("1---Ja");
        Scanner scan = new Scanner(System.in);
        k= scan.nextInt();
        return k;
    }

}
