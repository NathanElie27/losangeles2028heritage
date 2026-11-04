package model;

public class Participation {

    private int place;
    private String temps;
    private String recordOlympique;
    private Athlete athlete;
    private Medaille medaille;
    private EpreuveIndividuelle epreuveIndividuelle;

    public Participation(int place, String temps, String recordOlympique) {
        this.place = place;
        this.temps = temps;
        this.recordOlympique = recordOlympique;
    }

    public Participation(int place, String temps, String recordOlympique, Athlete athlete, Medaille medaille, EpreuveIndividuelle epreuveIndividuelle) {
        this.place = place;
        this.temps = temps;
        this.recordOlympique = recordOlympique;
        this.athlete = athlete;
        this.medaille = medaille;
        this.epreuveIndividuelle = epreuveIndividuelle;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public String getRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(String recordOlympique) {
        this.recordOlympique = recordOlympique;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Medaille getMedaille() {
        return medaille;
    }

    public void setMedaille(Medaille medaille) {
        this.medaille = medaille;
    }

    public EpreuveIndividuelle getEpreuveIndividuelle() {
        return epreuveIndividuelle;
    }

    public void setEpreuveIndividuelle(EpreuveIndividuelle epreuveIndividuelle) {
        this.epreuveIndividuelle = epreuveIndividuelle;
    }
}
