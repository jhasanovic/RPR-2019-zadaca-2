package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;

public class Predmet {
    private int idPredmeta;
    private String naziv;
    private int brojEcts;
    private int brojSatiUSemestru;
    private boolean obavezniPredmet;
    private Profesor profesor;
    private Map<Student,Integer> studentiNaPredmetu=new HashMap<>(); //predmet treba imati listu studenata i njihove ocjene iz predmeta
    //ako student ima null value onda je neocijenjen iz tog predmeta

    public Predmet(int idPredmeta, String naziv, int brojEcts, int brojSatiUSemestru, boolean obavezniPredmet) {
        this.idPredmeta = idPredmeta;
        this.naziv = naziv;
        this.brojEcts = brojEcts;
        this.brojSatiUSemestru = brojSatiUSemestru;
        this.obavezniPredmet = obavezniPredmet;
    }

    public int getIdPredmeta() {
        return idPredmeta;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrojEcts() {
        return brojEcts;
    }

    public int getBrojSatiUSemestru() {
        return brojSatiUSemestru;
    }

    public boolean isObavezniPredmet() {
        return obavezniPredmet;
    }

    public Map<Student, Integer> getStudentiNaPredmetu() {
        return studentiNaPredmetu;
    }

}
