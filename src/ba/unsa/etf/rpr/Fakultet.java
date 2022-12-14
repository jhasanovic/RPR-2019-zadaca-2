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
        return profesori.stream().filter(p->p.dajNormu()<120 || p.dajNormu()>150).collect(Collectors.toList());
    }

    public List<Profesor> sortirajPoNormi(){
        return profesori.stream().sorted(Comparator.comparingInt(Profesor::dajNormu).reversed())
                .collect(Collectors.toList());
    }
    
    public List<Profesor> sortirajPoBrojuStudenata(){
        return profesori.stream().sorted(Comparator.comparingInt(Profesor::ukupanBrojStudenataNaPredmetima).reversed())
                .collect(Collectors.toList());
    }
}
