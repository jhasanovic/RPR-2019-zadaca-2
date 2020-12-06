package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int idProfesora;
    private String ime;
    private String prezime;
    private List<Predmet> predmeti=new ArrayList<>();

    public Profesor(int idProfesora,String ime, String prezime) {
        this.idProfesora = idProfesora;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int dajNormu(){
        return predmeti.stream().filter(p->!p.getStudentiNaPredmetu().isEmpty()).mapToInt(Predmet::getBrojSatiUSemestru).sum();
    }
    public void dodajPredmet(Predmet predmet){
       predmeti.add(predmet);
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int ukupanBrojStudenataNaPredmetima(){
        return predmeti.stream().mapToInt(p->p.getStudentiNaPredmetu().size()).sum();
    }
}
