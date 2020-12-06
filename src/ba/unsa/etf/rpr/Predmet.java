package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;

public class Predmet{
    private int idPredmeta;
    private String naziv;
    private int brojEcts;
    private int brojSatiUSemestru;
    private boolean obavezniPredmet;
    private Map<Student,Integer> studentiNaPredmetu;

    public Predmet(int idPredmeta, String naziv, int brojEcts, int brojSatiUSemestru, boolean obavezniPredmet) {
        this.idPredmeta = idPredmeta;
        this.naziv = naziv;
        this.brojEcts = brojEcts;
        this.brojSatiUSemestru = brojSatiUSemestru;
        this.obavezniPredmet = obavezniPredmet;
        studentiNaPredmetu=new HashMap<>();
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
        return studentiNaPredmetu ;
    }
    public void upisiStudentaNaPredmet(Student s){
        studentiNaPredmetu.put(s,5);//ocjena je 5 dok je student ne upise
    }
    public void upisiOcjenu(Student s,Integer ocjena){
        studentiNaPredmetu.replace(s,ocjena);
    }

}
