package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;

public class Predmet{
    private final int idPredmeta;
    private final String naziv;
    private final int brojEcts;
    private final int brojSatiUSemestru;
    private final boolean obavezniPredmet;
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
        studentiNaPredmetu.put(s,5);
    }


    public void upisiOcjenu(Student s,Integer ocjena){
        if(studentiNaPredmetu.containsKey(s) && ocjena>5) studentiNaPredmetu.replace(s,ocjena);
        else if(!studentiNaPredmetu.containsKey(s)) throw new IllegalArgumentException("Student nije upisan na predmet!");
        else if(ocjena<=5) throw new IllegalArgumentException("Nelegalna vrijednost ocjene!");
    }

}
