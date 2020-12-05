package ba.unsa.etf.rpr;

import java.util.List;

public class CiklusStudija {
    private int idCiklusa;
    List<Semestar> semestri;

    public CiklusStudija(int idCiklusa, List<Semestar> semestri) {
        this.idCiklusa = idCiklusa;
        this.semestri = semestri;
    }

    public void dodajSemestar(Semestar semestar){}
}
