package ba.unsa.etf.rpr;

import java.util.Map;

public class Predmet {
    private int idPredmeta;
    private String naziv;
    private int brojEcts;
    private int brojSatiUSemestru;
    private boolean obavezniPredmet;
    private Map<Student,Integer> studentiNaPredmetu; //predmet treba imati listu studenata i njihove ocjene iz predmeta
    //ako student ima null value onda je neocijenjen iz tog predmeta
    private Profesor profesor;
    //DO IMENA PROFESORA SE MOZE DOCI TAKO STO SE PRETRAZE PROF NA FAKULTETU I U LISTI NJIHOVIH PREDMETA NADJE ID OVOG PREDMETA
    public Predmet(int idPredmeta, String naziv, int brojEcts, int brojSatiUSemestru, boolean obavezniPredmet) {
        this.idPredmeta = idPredmeta;
        this.naziv = naziv;
        this.brojEcts = brojEcts;
        this.brojSatiUSemestru = brojSatiUSemestru;
        this.obavezniPredmet = obavezniPredmet;
    }
}
