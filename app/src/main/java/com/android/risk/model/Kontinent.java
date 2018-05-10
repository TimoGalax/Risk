package com.android.risk.model;

//import java.util.Objects;

/**
 *
 * @author Thomas
 */
class Kontinent {
    private final Karte karte;
    private final Region[] regionen;
    private final String kontinentBezeichner;
    private final int truppenwert = 0; //TODO
    private boolean einheitlichBesetzt;
    private Spieler einheitlicherBesetzer;

    Kontinent(Karte karte, String bezeichner) {
        this.karte = karte;
        kontinentBezeichner = bezeichner;
        switch (bezeichner) {
            case "Nordamerika": //TODO Regionen und Truppenwerte abhängig vom Kontinent initialisieren
        }
    }

    boolean istEinheitlichBesetzt() {
        Spieler besetzer = regionen[0].getBesetzer();
        boolean einheitlich = true;
        for (int i=1;i<regionen.length;++i) {
            einheitlich = regionen[i].getBesetzer().equals(besetzer) && einheitlich;
        }
        einheitlichBesetzt = einheitlich;
        return einheitlich;
    }

    /**
     * Die Methode reicht die Anfrage nach dem Besetzer einer Region an
     *
     * @param region Die Regionenkennziffer der zu erhaltenden Region.
     * @return Der Besetzer der fraglichen Region.
     */
    Spieler getBesetzerRegion(int region) {
        return regionen.
    }

    Karte getKarte() {
        return karte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontinent kontinent1 = (Kontinent) o;
        return kontinentBezeichner.equals(kontinent1.kontinentBezeichner);
    }

    @Override
    public int hashCode() {
        int ausg;
        switch (kontinentBezeichner) {
            case "Nordamerika": ausg = 0; break;
            case "Südamerika": ausg = 1; break;
            case "Europa": ausg = 2; break;
            case "Afrika": ausg = 3; break;
            case "Asien": ausg = 4; break;
            default: ausg = 5; break; //gleichwertig zu "Australien"
        }
        return ausg;
    }
}
