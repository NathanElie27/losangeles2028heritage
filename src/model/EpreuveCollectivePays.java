package model;

import java.util.ArrayList;

public class EpreuveCollectivePays {

    private ArrayList<EpreuveCollective> epreuveCollectives;
    private ArrayList<Pays> pays;

    public EpreuveCollectivePays(ArrayList<EpreuveCollective> epreuveCollectives, ArrayList<Pays> pays) {
        this.epreuveCollectives = epreuveCollectives;
        this.pays = pays;
    }

    public ArrayList<EpreuveCollective> getEpreuveCollectives() {
        return epreuveCollectives;
    }

    public void setEpreuveCollectives(ArrayList<EpreuveCollective> epreuveCollectives) {
        this.epreuveCollectives = epreuveCollectives;
    }

    public ArrayList<Pays> getPays() {
        return pays;
    }

    public void setPays(ArrayList<Pays> pays) {
        this.pays = pays;
    }
}
