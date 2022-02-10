package com.example.tocopy;
/*--------------------------------------------------------
 *      Hoehere Technische Bundeslehranstalt STEYR
 *------------------------------------------------------*/
/**
 * @author  : Constantin Riedler
 *            3AHITN
 * @date    : 03 Februar 2022, 10:30
 * File:   Playfield.java
 *
 * @details
 *
 */
import java.util.Scanner;

/**
 * Enthält ein 2Dimensionales Array das ein Spielfeld darstellt
 * Methoden um dieses zu befüllen und auf Muster zu prüfen
 */
public class Playfield {
    protected char[][] Field = new char[6][7];

    /**
     * Konstruktor, setzt alle Felder des arrays auf "nicht belegt"
     */
    Playfield() {
        for (int i = 0; i < Field.length; i++) {

            for (int j = 0; j < Field[i].length; j++) {
                Field[i][j] = '#';
            }
        }
    }

    /**
     * Fragt und lest die gewünschte Spalte ein, in der ein Stein geworfen werden soll.
     * Es wird geprüft ob die Spalte belegt ist, wenn nicht wird ein Stein gesetzt
     *
     * @param currentp Übergibt den aktuellen Spieler, um zu wissen mit welchen Symbol setstone() aufgerufen werden soll
     * @return ob die Spalte belegt war oder nicht
     */
    void choosecol(Player currentp) {

        boolean check = true;
        int col;
        do {
            System.out.println("In Welche Spalte möchten Sie einen Stein werfen?");
            Scanner scan = new Scanner(System.in);
            col = scan.nextInt();
            if (!checkiffull(col)) {
                setStone(col, currentp);
            } else {
                check = false;
                System.out.println("Spalte bereits voll");
            }
        }while(!check);

    }

    /**
     * * Lest dass array von unten ausgehend aus und überprüft in jeder Zeile,
     * ob es sich um ein Freies Feld handelt. Wenn ja wird ein Stein gesetzt.
     *
     * @param col      In welche Spalte ein Stein fallen gelassen werden soll
     * @param currentp Welches Symbol von welchen Spieler gesetzt werden sonn
     */
    private void setStone(int col, Player currentp) {

        for (int j = Field.length; 0 < j; j--) {
            if (Field[j - 1][col] == '#') {
                Field[j - 1][col] = currentp.getSymbol();
            }

        }
    }


    /**
     * Überprüft ob in der obersten Zeile einer Spalte ein Stein ist, wenn ja wird zurückgegeben, das diese Spalte bereits voll ist.
     *
     * @param col Welche Spalte gecheckt werden soll
     * @return Ob die Spalte belegt ist oder nicht.
     */
    private boolean checkiffull(int col) {
        boolean rv = false;
        if (Field[0][col] != '#') {
            rv = true;
        }
        return rv;

    }

    public boolean checkwin(Playfield field) {
        boolean rv=false;

        for (int i = 0; i < field.Field.length; i++) {

            for (int j = 0; j < field.Field[i].length; j++) {
                field.Field[i][j] = '#';
            }
        }





        return rv;
    }

    /**
     * Überprüft ob das Feld zur gänze voll ist und noch kein Spieler gewonnen hat
     *
     * @return Ob das Spiel unentschieden ausgegangen ist oder nicht
     * @param pfield zu überprüfendes Feld
     */
    boolean checkdraw(Playfield pfield) {
        boolean rv = true;

        for (int i = 0; i < pfield.Field.length; i++) {

            for (int j = 0; j < pfield.Field[i].length; j++) {
                if((pfield.Field[i][j]=='#')&&(!pfield.checkwin(pfield))){
                    rv=false;
                }
            }
        }


        return rv;
    }
}
