package com.android.risk.model;

class Karte {
    private Kontinent kontinente[];

    Karte() {
        kontinente = new Kontinent[6]; //TODO Werte
        kontinente[0] = new Kontinent("Nordamerika");
        kontinente[0] = new Kontinent("Südamerika");
        kontinente[0] = new Kontinent("Europa");
        kontinente[0] = new Kontinent("Afrika");
        kontinente[0] = new Kontinent("Asien");
        kontinente[0] = new Kontinent("Australien");
    }

    boolean verbunden(int von, int nach) {
        return false;
    }

    Spieler getBesetzerRegion(int region) {
        if (region<0||region>41) {
            //TODO Exception
        }

        if (region<18) {
            return kontinente[0].getBesetzerRegion(region);
        } else if (region<30) {
            return kontinente[1].getBesetzerRegion(region);
        } else if (region<36) {
            return kontinente[2].getBesetzerRegion(region);
        }

        //TODO Werte konkretisieren; Methode ausbauen
    }

}
