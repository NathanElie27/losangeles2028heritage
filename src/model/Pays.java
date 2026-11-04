package model;

import java.util.ArrayList;

public class Pays {

    private int id;
    private String nom;
    private ArrayList<Athlete> Athletes;

    public Pays(int id, String nom) {
        this.id = id;
        this.nom = nom;
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
}
