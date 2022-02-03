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
    Player[] players=new Player[2];
    Playfield pfield;
    Player currentplayer;


    Game(Player[] players, Playfield pfield) {

        boolean w = true;
        boolean y=true;
        String name;
        char symbol;

        System.out.println("Name des ersten Spielers:");
        Scanner namescan = new Scanner(System.in);
        name = namescan.next();

        System.out.println("Symbol des ersten Spielers (Standard 'O', 'X'): ");
        Scanner symbolscan = new Scanner(System.in);
        symbol = symbolscan.next().charAt(0);

        Player p1 = new Player(name, symbol);

        do {

            System.out.println("Name des zweiten Spielers:");
            Scanner namescan1 = new Scanner(System.in);
            if (namescan1.next() == name) {
                System.out.println("Es können nicht 2 Spieler mit dem gleichen Namen existieren");
                y=false;
            }

            name = namescan.next();
        }while(!y);

        do{
            System.out.println("Symbol des zweiten Spielers (Standard 'O', 'X'): ");
            Scanner symbolscan1 = new Scanner(System.in);
            if (symbolscan1.next().charAt(0) == symbol) {
                System.out.println("2 Spieler können nicht das gleiche Symbol benutzen");
                w = false;
            }

                symbol = symbolscan.next().charAt(0);
            }while (!w);
        Player p2=new Player(name,symbol);

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
