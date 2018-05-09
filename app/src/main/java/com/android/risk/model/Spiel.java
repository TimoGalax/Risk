package com.android.risk.model;

/**
 *
 * @author Thomas
 */
public class Spiel {
    private Karte karte;
    private Spieler spieler[];

    /**
     *
     * -2 Registrierung der Spieler
     * -1 Setzen der verfügbaren Truppen
     * 0 null
     */
    private int phase = -2;
    private int amZug = 0;

    /**
     * Erzeugt ein neues Objekt der Klasse Spiel.
     *
     * @param anzahlSpieler Die Anzahl an Spielern, die sich am Spiel beteiligen.
     */
    public Spiel(int anzahlSpieler) {
        if (anzahlSpieler<2 || anzahlSpieler>6) {
            //TODO Exception
        }

        spieler = new Spieler[anzahlSpieler];
    }

    /**
     * Wird aufgerufen, wenn der Übergang in die nächste Phase vorgenommen wird.
     */
    private void naechstePhase() {
        phase = (phase+1)%3; //TODO unfertig
        if (phase == 0) {
            spieler[amZug].setAmZug(false);
            amZug = (amZug+1)%spieler.length;
            spieler[amZug].setAmZug(true);
        }
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

    public void spielerRegistrieren(Spieler spieler){
        this.spieler[amZug++] = spieler;
        if (amZug==this.spieler.length) {
            ++phase;
            amZug = 0;
        }
    }

}
