package com.android.risk.model;

/**
 *
 * @author Thomas
 */
class Karte {
    private Kontinent kontinente[];

    Karte() {
        kontinente = new Kontinent[6]; //TODO Werte
        kontinente[0] = new Kontinent(this,"Nordamerika");
        kontinente[1] = new Kontinent(this,"Südamerika");
        kontinente[2] = new Kontinent(this,"Europa");
        kontinente[3] = new Kontinent(this,"Afrika");
        kontinente[4] = new Kontinent(this,"Asien");
        kontinente[5] = new Kontinent(this,"Australien");
    }

    /**
     * Die Methode gibt an, ob zwei Regionen des selben Besetzers verbunden sind.
     * Als Verbunden gelten zwei Regionen, wenn es einen Pfad (def. Graphen) gibt,
     * der nur über Regeionen führt,
     *
     * @param von  Die Regionenkennziffer der ersten Region.
     * @param nach Die Regionenkennziffer der zweiten Region.
     * @return Gibt an, ob eine Verbindung mit den oben genannten vorraussetzungen besteht.
     */
    boolean verbunden(int von, int nach) {
        //TODO
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
        return null;
    }

}
