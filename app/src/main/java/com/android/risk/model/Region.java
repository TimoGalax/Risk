package com.android.risk.model;

import java.util.Objects;

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

    /**
     * 0  Alaska
     * 1  Nordwest-Territorium
     * 2  Grönland
     * 3  Alberta
     * 4  Ontario
     * 5  Quebec/Ost-Kanada
     * 6  Western United States
     * 7  Eastern United States
     * 8  Zentralamerika
     * --
     * 9  Venezuela
     * 10 Brazilien
     * 11 Peru
     * 12 Argentinien
     * --
     * 13 Island
     * 14 Großbritannien
     * 15 Skandinavien
     * 16 Russland
     * 17 Nordeuropa
     * 18 Südeuropa
     * 19 Westeuropa
     * --
     * 20 Ural
     * 21 Sibirien
     * 22 "Yakursk"
     * 23 Kamtschatka
     * 24 Irkutsk
     * 25 Mongolei
     * 26 Japan
     * 27 China
     * 28 Afgahnistan
     * 29 "Middle East"
     * 30 Indien
     * 31 Siam
     * --
     * 32 Nordafrika
     * 33 Ägypten
     * 34 Ostafrika
     * 35 Kongo
     * 36 Südafrika
     * 37 Madagaskar
     * --
     * 38 Indonesien
     * 39 Neuginea
     * 40 Westaustralien
     * 41 Ostaustralien
     */
    private Region[] angrenzendeGebiete;
    /**
     * Regionenbezeichner
     */
    private final int regionenname;
    private int truppen;
    private Spieler besetzer;

    Region(Kontinent kontinent, int regionenname) {
        this.accordingKontinent = kontinent;
        this.regionenname = regionenname;

    }

    void angrenzendeGebieteInitialisieren(Karte karte) {
        switch (regionenname) {
            case 0:
                angrenzendeGebiete = new Region[] {

                };
                break;
            case 1:
                angrenzendeGebiete = new Region[] {

                };
                break;
            case 2: angrenzendeGebiete = new Region[] {}; break;
            case 3: angrenzendeGebiete = new Region[] {}; break;
            case 4: angrenzendeGebiete = new Region[] {}; break;
            case 5: angrenzendeGebiete = new Region[] {}; break;
            case 6: angrenzendeGebiete = new Region[] {}; break;
            case 7: angrenzendeGebiete = new Region[] {}; break;
            case 8: angrenzendeGebiete = new Region[] {}; break;
            case 9: angrenzendeGebiete = new Region[] {}; break;
            case 10: angrenzendeGebiete = new Region[] {}; break;
            case 11: angrenzendeGebiete = new Region[] {}; break;
            case 12: angrenzendeGebiete = new Region[] {}; break;
            case 13: angrenzendeGebiete = new Region[] {}; break;
            case 14: angrenzendeGebiete = new Region[] {}; break;
            case 15: angrenzendeGebiete = new Region[] {}; break;
            case 16: angrenzendeGebiete = new Region[] {}; break;
            case 17: angrenzendeGebiete = new Region[] {}; break;
            case 18: angrenzendeGebiete = new Region[] {}; break;
            case 19: angrenzendeGebiete = new Region[] {}; break;
            case 20: angrenzendeGebiete = new Region[] {}; break;
            case 21: angrenzendeGebiete = new Region[] {}; break;
            case 22: angrenzendeGebiete = new Region[] {}; break;
            case 23: angrenzendeGebiete = new Region[] {}; break;
            case 24: angrenzendeGebiete = new Region[] {}; break;
            case 25: angrenzendeGebiete = new Region[] {}; break;
            case 26: angrenzendeGebiete = new Region[] {}; break;
            case 27: angrenzendeGebiete = new Region[] {}; break;
            case 28: angrenzendeGebiete = new Region[] {}; break;
            case 29: angrenzendeGebiete = new Region[] {}; break;
            case 30: angrenzendeGebiete = new Region[] {}; break;
            case 31: angrenzendeGebiete = new Region[] {}; break;
            case 32: angrenzendeGebiete = new Region[] {}; break;
            case 33: angrenzendeGebiete = new Region[] {}; break;
            case 34: angrenzendeGebiete = new Region[] {}; break;
            case 35: angrenzendeGebiete = new Region[] {}; break;
            case 36: angrenzendeGebiete = new Region[] {}; break;
            case 37: angrenzendeGebiete = new Region[] {}; break;
            case 38: angrenzendeGebiete = new Region[] {}; break;
            case 39: angrenzendeGebiete = new Region[] {}; break;
            case 40: angrenzendeGebiete = new Region[] {}; break;
            default: angrenzendeGebiete = new Region[] {};
        }
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

    void truppenEntfernen(int anzahl) {
        truppen-=anzahl;
    }

    /**
     * Eine simple Methode um den "Besetzer" der Region zu erhalten.
     *
     * @return Der Besetzer der Region.
     */
    Spieler getBesetzer() {
        return besetzer;
    }

    void setBesetzer(Spieler nBesetzer) {
        besetzer = nBesetzer;
        accordingKontinent.istEinheitlichBesetzt();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return regionenname == region.regionenname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accordingKontinent, regionenname);
    }


}
