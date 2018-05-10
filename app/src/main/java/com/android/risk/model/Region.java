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
     * 9  Venezuela
     * 10 Brazilien
     * 11 Peru
     * 12 Argentinien
     * 13 Island
     * 14 Großbritannien
     * 15 Skandinavien
     * 16 Russland
     * 17 Nordeuropa
     * 18 Südeuropa
     * 19 Westeuropa
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
     * 32 Nordafrika
     * 33 Ägypten
     * 34 Ostafrika
     * 35 Kongo
     * 36 Südafrika
     * 37 Madagaskar
     * 38 Indonesien
     * 39 Neuginea
     * 40 Westaustralien
     * 41 Ostaustralien
     */
    private int[] angrenzendeGebiete;
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

    void angrenzendeGebieteInitialisieren() {

        Karte karte = accordingKontinent.getKarte();

        switch (regionenname) {
            case 0: angrenzendeGebiete = {} break;
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;
            case 9: break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14: break;
            case 15: break;
            case 16: break;
            case 17: break;
            case 18: break;
            case 19: break;
            case 20: break;
            case 21: break;
            case 22: break;
            case 23: break;
            case 24: break;
            case 25: break;
            case 26: break;
            case 27: break;
            case 28: break;
            case 29: break;
            case 30: break;
            case 31: break;
            case 32: break;
            case 33: break;
            case 34: break;
            case 35: break;
            case 36: break;
            case 37: break;
            case 38: break;
            case 39: break;
            case 40: break;
            case 41: break;
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
        return regionenname == region.regionenname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accordingKontinent, regionenname);
    }


}
