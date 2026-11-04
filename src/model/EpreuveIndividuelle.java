package model;

public class EpreuveIndividuelle extends Epreuve {

    private String recordOlympique;

    public EpreuveIndividuelle(int id, String nom, String recordOlympique) {
        super(id, nom);
        this.recordOlympique = recordOlympique;
    }

    public String getRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(String recordOlympique) {
        this.recordOlympique = recordOlympique;
    }
}
