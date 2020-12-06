package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Semestar {
private final int idSemestra;
private List<Predmet> predmeti;

    public Semestar(int idSemestra) {
        this.idSemestra = idSemestra;
        predmeti=new ArrayList<>();
    }

    public void dodajPredmet(Predmet predmet){
        predmeti.add(predmet);
    }

    public int getIdSemestra() {
        return idSemestra;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }
    public int dajUkupanBrojECTSObaveznih(){
        return predmeti.stream().filter(p->p.isObavezniPredmet()).mapToInt(p->p.getBrojEcts()).sum();
    }

}
