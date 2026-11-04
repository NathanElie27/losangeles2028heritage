package model;

public abstract class Epreuve {

    private int id;
    private String nom;
    private Sport sport;

    public Epreuve(int id, String nom) {
        super();
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public abstract String participationEpreuve();
    public abstract int nbParticipantEpCollective(int nbPays);
    }
