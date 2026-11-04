package model;

import java.util.ArrayList;

public class Athlete {

    private int id;
    private String nom;
    private Pays pays;
    private ArrayList<Participation> participations;

    public Athlete() {
    }

    public Athlete(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Athlete(int id, String nom, Pays pays, ArrayList<Participation> participations) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
        this.participations = participations;
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

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public ArrayList<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(ArrayList<Participation> participations) {
        this.participations = participations;
    }

    public int nbAtheletePays(int nbAthletes){
        return nbAthletes;
    };
}
