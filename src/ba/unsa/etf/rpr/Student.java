package ba.unsa.etf.rpr;


import java.util.Objects;

public class Student{
    private String ime;
    private String prezime;
    private int brojIndeksa;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return brojIndeksa == student.brojIndeksa &&
                Objects.equals(ime, student.ime) &&
                Objects.equals(prezime, student.prezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, brojIndeksa);
    }

}
