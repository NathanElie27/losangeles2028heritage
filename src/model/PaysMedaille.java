package model;

import java.util.ArrayList;

public class PaysMedaille {

    private ArrayList<Medaille> medailles;
    private ArrayList<Pays> pays;

    public PaysMedaille(ArrayList<Medaille> medailles, ArrayList<Pays> pays) {
        this.medailles = medailles;
        this.pays = pays;
    }

    public ArrayList<Medaille> getMedailles() {
        return medailles;
    }

    public void setMedailles(ArrayList<Medaille> medailles) {
        this.medailles = medailles;
    }

    public ArrayList<Pays> getPays() {
        return pays;
    }

    public void setPays(ArrayList<Pays> pays) {
        this.pays = pays;
    }
}
