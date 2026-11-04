package model;

public class EpreuveCollective extends Epreuve{

    private String dureeMin;
    private int nbTours;

    public EpreuveCollective(int id, String nom, String dureeMin, int nbTours) {
        super(id, nom);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
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
}
