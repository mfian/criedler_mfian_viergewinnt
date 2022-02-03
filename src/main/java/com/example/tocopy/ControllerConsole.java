package com.example.tocopy;

import java.util.Scanner;

public class ControllerConsole {

    public static void main(String[] args) {

        play();
    }

    /**
     * Methode in der das eigentliche Spiel stattfindet
     */
    static void play(){
        protected FieldViewConsole fvc=new FieldViewConsole();
        protected PlayerviewConsole pvc=new PlayerviewConsole();
        boolean w = true;
        boolean y=true;
        String name;
        char symbol;
        Playfield pf=new Playfield();



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
        Game g1=new Game(p1,p2,pf);
        pvc.showcurrentPlayer(g1);
        g1.pfield.choosecol(g1.currentplayer);
        g1.pfield.checkwin(g1.pfield);
    }

}
