package com.example.tocopy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Konstroller Klasse
 * @author Constantin Riedler
 */

public class HelloController {
    @FXML
    private Label welcomeText;
    private Player p1=new Player("Max",'O');
    private Player p2=new Player("Moritz",'X');
    Playfield pf=new Playfield();
    FieldViewGUI fvg=new FieldViewGUI();
    PlayerViewGUI pvg=new PlayerViewGUI();
    Game g1=new Game(p1,p2,pf);




    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    protected void onClick() {
        g1.currentplayer=g1.getstarter(p1,p2);
        while (!g1.pfield.checkwin(pf,g1.currentplayer.symbol)&&!g1.pfield.checkdraw(pf,g1.currentplayer.symbol)) {
            fvg.showField(g1.pfield);
            pvg.showcurrentPlayer(g1.currentplayer.pname);
            g1.pfield.choosecol(g1.pfield,g1.currentplayer);
            if (g1.pfield.checkwin(g1.pfield,g1.currentplayer.symbol)) {
                g1.congratulate(g1.currentplayer.pname);
            } else if (g1.pfield.checkdraw(g1.pfield,g1.currentplayer.symbol)) {
                g1.printdraw();
            }
            g1.currentplayer=g1.switchplayer(g1.currentplayer, p1,p2);

        }
    }


    public void createP(ActionEvent actionEvent) {

    }
}
