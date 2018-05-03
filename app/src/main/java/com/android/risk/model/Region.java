package com.android.risk.model;

import java.util.Objects;
import java.util.TreeSet;

/**
 * Die Klasse "Region" ist der kleinste Bestandteil der "Welt" des Risiko spiels.
 * Sie enthält ihren Kontinent, die auf ihr stationierten Truppen, der Besetzer der Region,
 * eine Regionen kennziffer und die Angrenzenden Gebiete.
 *
 * Noch ist die Idee, dass diese Klasse keine überprüfung auf Validität ausführen muss, da
 * diese von einer Übergeordneten Klasse (Kontinent, Karte, Spiel) übernommen wird.
 *
 * @author Thomas
 */
class Region {
    private final Kontinent accordingKontinent;
    private final int regionenname;
    private final TreeSet<Region> angrenzendeGebiete = new TreeSet<>();
    private int truppen;
    private Spieler besetzer;

    Region(Kontinent kontinent, int regionenname) {
        this.accordingKontinent = kontinent;
        this.regionenname = regionenname;

        //TODO angrenzende Gebiete hinzufügen

    }

    /**
     * Die Methode ist für die 3. Phase (Truppenbewegung) von Bedeutung.
     * Mit ihr wird die Menge der abzuziehenden Truppen festgelegt.
     *
     * @param anzahl Die Anzahl der Truppen
     */
    void truppenBewegen(int anzahl) {

    }

    /**
     * Die Methode ist für den Spielbeginn und die 1. Phase (Truppen setzen) von Bedeutung.
     * Die Menge der Truppen wird der aktuellen Truppenzahl hinzugefügt.
     *
     * @param anzahl Die Anzahl der hinzuzufügenden Truppen.
     */
    void truppenHinzufuegen(int anzahl) {
        truppen+=anzahl;
    }


    void angreifen(int anzahl) {

    }

    /**
     * Eine simple Methode um den "Besetzer" der Region zu erhalten.
     *
     * @return Der Besetzer der Region.
     */
    Spieler getBesetzer() {
        return besetzer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return regionenname == region.regionenname &&
                Objects.equals(accordingKontinent, region.accordingKontinent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accordingKontinent, regionenname);
    }
}
