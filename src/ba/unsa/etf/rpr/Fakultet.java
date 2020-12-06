package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fakultet {
    private List<CiklusStudija> ciklusi;
    private List<Profesor> profesori;

    public Fakultet() {
        ciklusi=new ArrayList<>();
        profesori = new ArrayList<>();
    }

    public List<CiklusStudija> getCiklusi() {
        return ciklusi;
    }

    public List<Profesor> getProfesori() {
        return profesori;
    }
    public void dodajCiklus(CiklusStudija ciklus){
        ciklusi.add(ciklus);
    }
    public void dodajProfesora(Profesor profesor){
        profesori.add(profesor);
    }
    public List<Profesor> getProfesoriVanNorme(){
        List<Profesor> bezNorme= new ArrayList<>();
        bezNorme = profesori.stream().filter(p->p.dajNormu()<120 || p.dajNormu()>150).collect(Collectors.toList());
        return bezNorme;
    }
    public List<Profesor> sortirajPoNormi(){
        List<Profesor> sortiranaLista = profesori.stream().sorted(Comparator.comparingInt(Profesor::dajNormu))
                .collect(Collectors.toList());
        return sortiranaLista;
    }
}
