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
 *   Game Klasse. Besitzt 2 Spieler ein Spielfeld, und speichert auch als Eigenschaft den Spieler der an der Reihe ist.
 */

/**
 * Game Klasse enthält alle Elemente die ein VierGewinnt Spiel benötigt
 * Und Methoden um diese zu Verändern oder einzulesen
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

    /**
     * Gibt aus, dass das Spiel gewonnen wurde
     * @param pname Der Name welcher Gewonnen hat
     */
    public void congratulate(String pname) {
        System.out.println("Glückwunsch"+ pname + ", Sie haben das Spiel gewonnen");
    }

    /**
     * Gibt aus dass das Spiel in Unentschieden geendet ist
     */
    public void printdraw() {
        System.out.println("Das Spiel endetet in einem Unentschieden");

    }

    /**
     * Überprüft den namen des akutellen Spielers mit einem der 2 Spieler, wenn dieser übereinstimmt wird
     * der anderer Spieler, der nicht überprüft wurde zurückgegeben
     * @param currentplayer Spieler der an der Reihe ist
      * @param p1 einer der 2 aktuellen Spieler
     * @param p2 einer der 2 akutellen Spieler
     * @return den Spieler der davor nicht currentplayer war
     */
    public Player switchplayer(Player currentplayer, Player p1, Player p2) {
        if(currentplayer.pname==p1.pname){
            return p2;
        } else {
            return p1;
        }
    }
}
