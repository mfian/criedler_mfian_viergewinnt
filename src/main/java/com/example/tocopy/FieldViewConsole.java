package com.example.tocopy;

/**
 * Konsolenausgabe eines Feldes
 */
public class FieldViewConsole implements FieldView{
    /**
     * Iteriert das Übergebene Feld durch und macht einen Zeilenumbruch am Ende jeder Reihe
     * @param Field auszugebenes Feld
     */
    @Override
    public void showField(Playfield Field) {
        for (int i = 0; i < Field.Field.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < Field.Field[i].length; j++) {
                System.out.print(Field.Field[i][j]);
                System.out.print(" | ");
            }
        }
    }
}
