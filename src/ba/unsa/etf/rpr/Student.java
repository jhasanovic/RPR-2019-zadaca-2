package ba.unsa.etf.rpr;


public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public void dajPrepisOcjena(int idCiklusa, int idSemestra){
        //treba za sve predmete na koje je student upisan izlistati ime predmeta i ocjenu
        //vratiti se u ciklus, pa u semestar, pa u svim predmetima traziti datog studenta
        //i iz mape studentiNaPredmetu uzeti njegovu ocjenu
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }
}
