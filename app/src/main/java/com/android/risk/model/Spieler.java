package com.android.risk.model;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Spieler {
    private final Farbe farbe;
    private Spiel spiel;
    private int truppenzahl;
    private int ungesetzteTruppen;
    private ArrayList<Integer> besetzteRegionen = new ArrayList<>();
    private boolean amZug = false;
    private final String name;

    Spieler(Farbe farbe, String name) {
        this.farbe = farbe;
        this.name=name;
    }

    void ungesetzteTruppenHinzufuegen(int anzahl) {
        ungesetzteTruppen = anzahl;
    }

    public Farbe getFarbe(){
        return farbe;
    }

    public void truppenSetzen(int region, int anzahl) {
        if (!besetzteRegionen.contains(region)) {
            //TODO Exception
            return;
        }
        spiel.truppenSetzen(region,anzahl);
    }

    public void setzenBeenden() {
        spiel.setzenBeenden();
    }

    public void angreifen(int von, int nach, int anzahl) {
        spiel.angreifen(von, nach, anzahl);
    }

    public void angriffBeenden() {
        spiel.angriffBeenden();
    }

    public void truppenBewegen(int von, int nach, int anzahl) {
        spiel.truppenBewegen(von,nach,anzahl);
    }

    public void zugBeenden() {
        spiel.zugBeenden();
    }

    public void setAmZug(boolean amZug) {
        this.amZug = amZug;
    }

}
