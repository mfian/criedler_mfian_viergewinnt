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
 *   Player Klasse, ein Player hat einen Namen und ein zugewiesenes Symbol. Diese können gesetzt und abgefragt werden durch jeweilige Methoden
 */
public class Player {
    String pname;
    char symbol;

    public Player(String pname, char symbol) {
        this.pname = pname;
        this.symbol = symbol;
    }

    /**
     * Gibt den namen von einem Player objekt zurück
     * @return  den Namen
     */
    public String getPname() {
        return pname;
    }

    /**
     * Setzt den namen von einem Player objekt zurück
     * @param pname der Name der gesetzt werden soll
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * Gibt das Symbol von einem Player objekt zurück
     * @return das Symbol
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Setzt das Symbol eines Player objekts
     * @param symbol welches symbol gesetzt werden soll
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
