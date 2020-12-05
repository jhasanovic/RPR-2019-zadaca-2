package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Profesor {
    private String idProfesora;
    private String ime;
    private String prezime;
    private List<Predmet> predmeti;

    public Profesor(String idProfesora,String ime, String prezime, List<Predmet> predmeti) {
        this.idProfesora = idProfesora;
        this.ime = ime;
        this.prezime = prezime;
        this.predmeti = predmeti;
        predmeti=new ArrayList<>();
    }

    public int dajNormu(){
        //proci kroz listu predmeta i vidjeti gdje je predmet.studentinapredmetu neprazna mapa i dodati sate predmeta
        Stream<Predmet> stream=predmeti.stream();
        int norma = predmeti.stream().filter(p->!p.getStudentiNaPredmetu().isEmpty()).mapToInt(Predmet::getBrojSatiUSemestru).sum();
        return norma;
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

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public String getIdProfesora() {
        return idProfesora;
    }
}
