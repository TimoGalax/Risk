package com.android.risk.model;

/**
 *
 * @author Thomas
 */
public class Spiel {
    private Karte karte;
    private Spieler spieler[];
    private int phase = -1;
    private int amZug = 0;

    public Spiel(int anzahlSpieler) {
        if (anzahlSpieler<2 || anzahlSpieler>6) {
            //TODO Exception
        }

        spieler = new Spieler[anzahlSpieler];
        for (int i=0;i<anzahlSpieler;++i) {
            spieler[i] = new Spieler(new Farbe(i),this); //TODO Farbauswahl
        }
    }

    private void naechstePhase() {
        phase = (phase+1)%3;
    }

    private void truppenHinzufuegen() {

    }

    void truppenSetzen(int region, int anzahl) {
        if (phase!=0) {
            //TODO Exception
        }

    }

    void setzenBeenden() {

    }

    void angreifen(int von, int nach, int anzahl) {

    }

    void angriffBeenden() {

    }

    void truppenBewegen(int von, int nach, int anzahl) {

    }

    void zugBeenden() {

    }

}
