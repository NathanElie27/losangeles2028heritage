package model;

public class Participation {

    private int place;
    private String temps;
    private String recordOlympique;

    public Participation(int place, String temps, String recordOlympique) {
        this.place = place;
        this.temps = temps;
        this.recordOlympique = recordOlympique;
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
}
