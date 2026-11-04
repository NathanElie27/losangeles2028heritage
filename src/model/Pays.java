package model;

import java.util.ArrayList;

public class Pays {

    private int id;
    private String nom;
    private ArrayList<Athlete> Athletes;
    private ArrayList<Medaille> medailles;
    private ArrayList<EpreuveCollective> epreuveCollectives;

    public Pays(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Pays(int id, String nom, ArrayList<Athlete> athletes, ArrayList<Medaille> medailles, ArrayList<EpreuveCollective> epreuveCollectives) {
        this.id = id;
        this.nom = nom;
        Athletes = athletes;
        this.medailles = medailles;
        this.epreuveCollectives = epreuveCollectives;
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

    public ArrayList<Athlete> getAthletes() {
        return Athletes;
    }

    public void setAthletes(ArrayList<Athlete> athletes) {
        Athletes = athletes;
    }

    public ArrayList<Medaille> getMedailles() {
        return medailles;
    }

    public void setMedailles(ArrayList<Medaille> medailles) {
        this.medailles = medailles;
    }

    public ArrayList<EpreuveCollective> getEpreuveCollectives() {
        return epreuveCollectives;
    }

    public void setEpreuveCollectives(ArrayList<EpreuveCollective> epreuveCollectives) {
        this.epreuveCollectives = epreuveCollectives;
    }
}
