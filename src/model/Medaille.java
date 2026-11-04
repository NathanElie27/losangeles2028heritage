package model;

import java.util.ArrayList;

public class Medaille {

    private int id;
    private String nom;
    private int nbPoints;
    private ArrayList<Participation> participations;


    public Medaille(int id, String nom, int nbPoints) {
        this.id = id;
        this.nom = nom;
        this.nbPoints = nbPoints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public ArrayList<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(ArrayList<Participation> participations) {
        this.participations = participations;
    }
}
