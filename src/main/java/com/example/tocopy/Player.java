package com.example.tocopy;

public class Player {
    String pname;
    char symbol;

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