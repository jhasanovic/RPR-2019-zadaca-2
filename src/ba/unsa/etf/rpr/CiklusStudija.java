package ba.unsa.etf.rpr;

import java.util.List;

public class CiklusStudija {
    private int idCiklusa;
    private List<Semestar> semestri;

    public CiklusStudija(int idCiklusa, List<Semestar> semestri) {
        this.idCiklusa = idCiklusa;
        this.semestri = semestri;
    }

    public void dodajSemestar(Semestar semestar){
        semestri.add(semestar);
    }
    public void obrisiSemestar(int idSemestra){
        //za svaki semestar u listi provjeriti
    }

    public int getIdCiklusa() {
        return idCiklusa;
    }

    public List<Semestar> getSemestri() {
        return semestri;
    }
}
