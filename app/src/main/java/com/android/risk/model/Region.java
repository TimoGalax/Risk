package com.android.risk.model;

class Region {
    private Kontinent accordingKontinent;
    private int truppen;
    private Spieler besetzer;
    private int regionenname;
    private int angrenzendeGebiete[];

    Region(Kontinent kontinent) {
        this.accordingKontinent = kontinent;
    }

    void truppenBewegen(int anzahl) {

    }

    void truppenHinzufuegen(int anzahl) {

    }

    void angreifen(int anzahl) {

    }

    Spieler getBesetzer() {
        return besetzer;
    }

}
