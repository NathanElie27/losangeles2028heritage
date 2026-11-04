package model;

import java.util.ArrayList;

public class EpreuveIndividuelle extends Epreuve {

    private String recordOlympique;
    private ArrayList<Participation> participations;

    public EpreuveIndividuelle(int id, String nom, String recordOlympique) {
        super(id, nom);
        this.recordOlympique = recordOlympique;
    }

    public EpreuveIndividuelle(int id, String nom, String recordOlympique, ArrayList<Participation> participations) {
        super(id, nom);
        this.recordOlympique = recordOlympique;
        this.participations = participations;
    }

    public String getRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(String recordOlympique) {
        this.recordOlympique = recordOlympique;
    }

    @Override
    public String participationEpreuve(){

        return "";
    }
}
