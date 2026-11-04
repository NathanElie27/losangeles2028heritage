package model;

import java.util.ArrayList;

public class EpreuveCollective extends Epreuve{

    private String dureeMin;
    private int nbTours;
    private ArrayList<Pays> pays = new ArrayList<Pays>();

    public EpreuveCollective(int id, String nom, String dureeMin, int nbTours) {
        super(id, nom);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
    }

    public EpreuveCollective(int id, String nom, String dureeMin, int nbTours, ArrayList<Pays> pays) {
        super(id, nom);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
        this.pays = pays;
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

    public ArrayList<Pays> getPays() {
        return pays;
    }

    public void setPays(ArrayList<Pays> pays) {
        this.pays = pays;
    }

    @Override
    public String participationEpreuve() {
        return "test";
    }

    @Override
    public int nbParticipantEpCollective(int nbPays) {
        return nbPays;
    }
}
