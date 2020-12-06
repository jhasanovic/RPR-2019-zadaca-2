package ba.unsa.etf.rpr;

public class Student{
    private String ime;
    private String prezime;
    private final int brojIndeksa;
    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
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
