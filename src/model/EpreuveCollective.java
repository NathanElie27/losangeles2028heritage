package model;

import java.util.ArrayList;

public class EpreuveCollective extends Epreuve{

    private String dureeMin;
    private int nbTours;
    private EpreuveCollectivePays epreuveCollectivePays;

    public EpreuveCollective(int id, String nom, String dureeMin, int nbTours) {
        super(id, nom);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
    }

    public EpreuveCollective(int id, String nom, String dureeMin, int nbTours, EpreuveCollectivePays epreuveCollectivePays) {
        super(id, nom);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
        this.epreuveCollectivePays = epreuveCollectivePays;
    }

    public String getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(String dureeMin) {
        this.dureeMin = dureeMin;
    }

    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    public EpreuveCollectivePays getEpreuveCollectivePays() {
        return epreuveCollectivePays;
    }

    public void setEpreuveCollectivePays(EpreuveCollectivePays epreuveCollectivePays) {
        this.epreuveCollectivePays = epreuveCollectivePays;
    }

    @Override
    public String participationEpreuve(){

        return "";
    }
}
