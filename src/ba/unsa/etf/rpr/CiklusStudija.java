package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public void upisiStudentaUSemestar(Student s,Semestar semestar,List<Predmet> odabraniIzborniPredmeti){
        //neka idCiklusa sluzi da znam u kojoj mapi trazim semestar, korisnik unese broj semestra,a ja nadjem u mapi

        int sumaIzbornih=odabraniIzborniPredmeti.stream().mapToInt(p->p.getBrojEcts()).sum();
        int sumaObaveznih=semestar.dajUkupanBrojECTSObaveznih();
        if(sumaIzbornih+sumaObaveznih<30) throw new IllegalStateException("Nedovoljno ECTS bodova!");

        semestar.getPredmeti().stream().forEach((p) -> {
            if(p.isObavezniPredmet()) p.upisiStudentaNaPredmet(s);
            else if(odabraniIzborniPredmeti.contains(p)) {
                p.upisiStudentaNaPredmet(s);
            }
        });
    }
    public Map<String,Integer> dajPrepisOcjena(Student s, Semestar semestar){
        return semestar.getPredmeti()
                        .stream().filter(c->c.getStudentiNaPredmetu().size()!=0)
                        .collect(Collectors.toMap(c -> c.getNaziv(), c -> c.getStudentiNaPredmetu().get(s)));
    }

}
