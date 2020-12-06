package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CiklusStudija {
    private final int idCiklusa;
    private List<Semestar> semestri;

    public int getIdCiklusa() {
        return idCiklusa;
    }

    public CiklusStudija(int idCiklusa) {
        this.idCiklusa = idCiklusa;
        semestri=new ArrayList<>();
    }

    public void dodajSemestar(Semestar semestar){
        semestri.add(semestar);
    }

    public void upisiStudentaUSemestar(Student s,Semestar semestar,List<Predmet> odabraniIzborniPredmeti){
        int sumaIzbornih=0;
        if(!odabraniIzborniPredmeti.isEmpty())
            sumaIzbornih=odabraniIzborniPredmeti.stream().mapToInt(p->p.getBrojEcts()).sum();
        int sumaObaveznih=semestar.dajUkupanBrojECTSObaveznih();
        if(sumaIzbornih+sumaObaveznih<30) throw new IllegalStateException("Nedovoljno ECTS bodova!");

        semestar.getPredmeti().stream().forEach(p -> {
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
