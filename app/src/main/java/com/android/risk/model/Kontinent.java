package com.android.risk.model;

class Kontinent {
    private Region regionen[];
    private String kontinent;
    private int truppenwert;
    private boolean einheitlichBesetzt;

    Kontinent(String bezeichner) {
        kontinent = bezeichner;
        switch (bezeichner) {
            case "Nordamerika": //TODO Regionen abhängig vom Kontinent initialisieren
        }
    }

    Spieler getBesetzerRegion(int region) {

    }

}
