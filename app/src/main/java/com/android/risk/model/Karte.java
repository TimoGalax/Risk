package com.android.risk.model;

/**
 *
 * @author Thomas
 */
class Karte {
    private Kontinent kontinente[];
    private boolean[] besucht = new boolean[42];

    Karte() {
        kontinente = new Kontinent[6]; //TODO Werte
        kontinente[0] = new Kontinent(this,"Nordamerika");
        kontinente[1] = new Kontinent(this,"Südamerika");
        kontinente[2] = new Kontinent(this,"Europa");
        kontinente[3] = new Kontinent(this,"Asien");
        kontinente[4] = new Kontinent(this,"Afrika");
        kontinente[5] = new Kontinent(this,"Australien");

        for (Kontinent kontinent : kontinente) {
            kontinent.angrenzendeGebieteInitialisieren();
        }
    }

    /**
     * Die Methode gibt an, ob zwei Regionen des selben Besetzers verbunden sind.
     * Als Verbunden gelten zwei Regionen, wenn es einen Pfad (def. Graphen) gibt,
     * der nur über Regeionen führt, die von einem Spieler besetzt sind.
     *
     * @param von  Die Regionenkennziffer der ersten Region.
     * @param nach Die Regionenkennziffer der zweiten Region.
     * @return Gibt an, ob eine Verbindung mit den oben genannten vorraussetzungen besteht.
     */
    boolean verbunden(int von, int nach) {
        besucht = new boolean[42];

        return false;
    }

    boolean[] getBesucht() {
        return besucht;
    }

    Region getRegion(int region) {
        if (region<0||region>41) {
            //TODO Exception
        }

        if (region<9) {
            return kontinente[0].getRegion(region);
        } else if (region<13) {
            return kontinente[1].getRegion(region);
        } else if (region<20) {
            return kontinente[2].getRegion(region);
        } else if (region<32) {
            return kontinente[3].getRegion(region);
        } else if (region<38) {
            return kontinente[4].getRegion(region);
        } else {
            return kontinente[5].getRegion(region);
        }
    }

    Spieler getBesetzerRegion(int region) {
        return getRegion(region).getBesetzer();
    }

}
