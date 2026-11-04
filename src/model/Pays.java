package model;

import java.util.ArrayList;

public class Pays {

    private int id;
    private String nom;
    private ArrayList<Athlete> Athletes;
    private PaysMedaille paysMedaille;
    private EpreuveCollectivePays epreuveCollectivePays;

    public Pays(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Pays(int id, String nom, ArrayList<Athlete> athletes, PaysMedaille paysMedaille, EpreuveCollectivePays epreuveCollectivePays) {
        this.id = id;
        this.nom = nom;
        Athletes = athletes;
        this.paysMedaille = paysMedaille;
        this.epreuveCollectivePays = epreuveCollectivePays;
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

    public PaysMedaille getPaysMedaille() {
        return paysMedaille;
    }

    public void setPaysMedaille(PaysMedaille paysMedaille) {
        this.paysMedaille = paysMedaille;
    }

    public EpreuveCollectivePays getEpreuveCollectivePays() {
        return epreuveCollectivePays;
    }

    public void setEpreuveCollectivePays(EpreuveCollectivePays epreuveCollectivePays) {
        this.epreuveCollectivePays = epreuveCollectivePays;
    }
}
