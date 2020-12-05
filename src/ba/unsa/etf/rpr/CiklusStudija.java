package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class CiklusStudija {
    private int idCiklusa;
    private List<Semestar> semestri;

    public CiklusStudija(int idCiklusa) {
        this.idCiklusa = idCiklusa;
        semestri=new ArrayList<>();
    }

    public void dodajSemestar(Semestar semestar){
        semestri.add(semestar);
    }

    public int getIdCiklusa() {
        return idCiklusa;
    }

    public List<Semestar> getSemestri() {
        return semestri;
    }
}
