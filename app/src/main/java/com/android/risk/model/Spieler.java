package com.android.risk.model;

import java.util.ArrayList;

/**
 * @author Jürgen
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

    /**
     * Vor der 1.Phase: Der Spieler bekommt je nach besetzten Gebieten eine Anzahl von Truppen
     * @param anzahl: Anzahl der Truppen
     */
    void ungesetzteTruppenHinzufuegen(int anzahl) {
        ungesetzteTruppen = anzahl;
    }

    /**
     * Rückgabe der Spielerfarbe
     * @return Farbe
     */
    public Farbe getFarbe(){
        return farbe;
    }

    /**
     * 1.Phase: ungesetzte Truppen werden auf die eigenen Gebiete verteilt
     * @param region: Regionen auf denen die Truppen hinzugefügt werden sollen
     * @param anzahl: Anzahl der Truppen, die gesetzt werden sollen
     */
    public void truppenSetzen(int region, int anzahl) {
        if (!besetzteRegionen.contains(region)) {
            //TODO Exception
            return;
        }
        spiel.truppenSetzen(region,anzahl);
    }

    /**
     * Beendet die erste Phase
     */
    public void setzenBeenden() {
        spiel.setzenBeenden();
    }

    /**
     * 2.Phase: Angriff und eventuelle Übernahme einer Region
     * @param von: Ausgangsgebiet
     * @param nach: angegriffenes Gebiet
     * @param anzahl: Anzahl der angreifenden Truppen
     */
    public void angreifen(int von, int nach, int anzahl) {
        spiel.angreifen(von, nach, anzahl);
    }

    /**
     * Beendet die zweite Phase
     */
    public void angriffBeenden() {
        spiel.angriffBeenden();
    }

    /**
     * 3.Phase: eigene Truppen können von einem eigenen Gebiet auf ein anderes eigenes Gebiet verschoben
     * werden,welches mit dem Ausgangsgebiet verbunden ist.
     * @param von: Ausgangsgebiet
     * @param nach: Zielgebiet
     * @param anzahl: Anzahl der Truppen
     */
    public void truppenBewegen(int von, int nach, int anzahl) {
        spiel.truppenBewegen(von,nach,anzahl);
    }

    /**
     * Beendet die dritte Phase
     */
    public void zugBeenden() {
        spiel.zugBeenden();
    }

    public void setAmZug(boolean amZug) {
        this.amZug = amZug;
    }

}
