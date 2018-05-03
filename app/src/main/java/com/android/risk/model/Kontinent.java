package com.android.risk.model;

import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Thomas
 */
class Kontinent {
    private final TreeSet<Region> regionen = new TreeSet<>();
    private final String kontinent;
    private final int truppenwert = 0; //TODO
    private boolean einheitlichBesetzt;
    private Spieler einheitlicherBesetzer;

    Kontinent(String bezeichner) {
        kontinent = bezeichner;
        switch (bezeichner) {
            case "Nordamerika": //TODO Regionen und Truppenwerte abhängig vom Kontinent initialisieren
        }
    }

    /**
     * Die Methode reicht die Anfrage nach dem Besetzer einer Region an
     *
     * @param region Die Regionenkennziffer der zu erhaltenden Region.
     * @return Der Besetzer der fraglichen Region.
     */
    Spieler getBesetzerRegion(int region) {
        //TODO
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontinent kontinent1 = (Kontinent) o;
        return Objects.equals(kontinent, kontinent1.kontinent);
    }

    @Override
    public int hashCode() {
        int ausg;
        switch (kontinent) {
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
