package com.example.tocopy;

import java.util.Objects;
import java.util.Scanner;

/**
 * Konsolenanwendung für das VierGewinnt Spiel
 */
public class ControllerConsole {

    public static void main(String[] args) {

        play();
    }

    /**
     * Methode in der das eigentliche Spiel stattfindet
     */
    static void play(){
        FieldViewConsole fvc=new FieldViewConsole();
        PlayerviewConsole pvc=new PlayerviewConsole();
        boolean w;
        boolean y;
        int restart=1;
        boolean gameover=false;
        String name;
        String name1;
        char symbol;
        char symbol1;
        Playfield pf=new Playfield();


while(restart==1) {
    System.out.println("Name des ersten Spielers:");
    Scanner namescan = new Scanner(System.in);
    name = namescan.nextLine();

    System.out.println("Symbol des ersten Spielers (Standard 'O', 'X'): ");
    Scanner symbolscan = new Scanner(System.in);
    symbol = symbolscan.nextLine().charAt(0);

    Player p1 = new Player(name, symbol);

    do {
        y=true;
        System.out.println("Name des zweiten Spielers:");
        Scanner namescan1 = new Scanner(System.in);
        name1=namescan1.nextLine();

        if (Objects.equals(name1, name)) {
            System.out.println("Es können nicht 2 Spieler mit dem gleichen Namen existieren");
            y = false;
        }
    } while (!y);

    do {
        w = true; // TODO Wittner: sonst kommt man nie aus der Schleife raus, wenn w auf false gesetzt wird!
        System.out.println("Symbol des zweiten Spielers (Standard 'O', 'X'): ");
        Scanner symbolscan1 = new Scanner(System.in);
        symbol1 = symbolscan1.next().charAt(0);
        if (symbol1 == symbol) {
            System.out.println("2 Spieler können nicht das gleiche Symbol benutzen");
            w = false;
        }

    } while (!w);
    Player p2 = new Player(name1, symbol1);
    Game g1 = new Game(p1, p2, pf);
    g1.currentplayer=g1.getstarter(p1,p2);
    while (!gameover) {
        fvc.showField(g1.pfield);
        pvc.showcurrentPlayer(g1.currentplayer.pname);
        g1.pfield.choosecol(g1.pfield, g1.currentplayer);
        if (g1.pfield.checkwin(g1.pfield, g1.currentplayer.symbol)) {
            gameover = true;
            g1.congratulate(g1.currentplayer.pname);
        } else if (g1.pfield.checkdraw(g1.pfield, g1.currentplayer.symbol)) {
            gameover = true;
            g1.printdraw();
        }
        g1.currentplayer=g1.switchplayer(g1.currentplayer, p1,p2);


    }
    restart= g1.restart();

}

    }

}
