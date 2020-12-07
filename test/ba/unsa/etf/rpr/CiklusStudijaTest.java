package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CiklusStudijaTest {

    @Test
    void konstruktorCiklusTest() {
        CiklusStudija ciklus=new CiklusStudija(3);
        assertEquals(3,ciklus.getIdCiklusa());
    }

    @Test
    void dodajSemestarTest() {
        CiklusStudija ciklus=new CiklusStudija(3);
        Semestar s=new Semestar(1);
        ciklus.dodajSemestar(s);
        assertEquals(1,ciklus.getSemestri().get(0).getIdSemestra());
    }

    @Test
    void upisiStudentaUSemestarIzuzetakTest() {
        CiklusStudija ciklus=new CiklusStudija(1);
        Semestar semestar=new Semestar(3);
        ciklus.dodajSemestar(semestar);
        Student s=new Student("Ja","Ja",18491);
        List<Predmet> izborni=new ArrayList<>();

        Exception exception = assertThrows(IllegalStateException.class,
                () -> ciklus.upisiStudentaUSemestar(s,semestar,izborni) );
    }

    @Test
    void upisiStudentaUSemestarTest() {
        Fakultet f=new Fakultet();
        CiklusStudija ciklus=new CiklusStudija(1);
        f.dodajCiklus(ciklus);
        Semestar semestar=new Semestar(3);
        ciklus.dodajSemestar(semestar);
        Student s=new Student("Ja","Ja",18491);
        Predmet p1=new Predmet(1,"Algoritmi i strukture podataka",5,60,true);
        Predmet p2=new Predmet(2,"Logički dizajn",5,60,true);
        Predmet p3=new Predmet(3,"Razvoj programskih rješenja",5,60,true);
        Predmet p4=new Predmet(4,"Osnove baza podataka",5,60,true);
        Predmet p5=new Predmet(5,"Diskretna matematika",5,60,true);
        Predmet p6=new Predmet(6,"Sistemsko programiranje",5,60,false);
        List<Predmet> izborni=new ArrayList<>();
        semestar.dodajPredmet(p1);
        semestar.dodajPredmet(p2);
        semestar.dodajPredmet(p3);
        semestar.dodajPredmet(p4);
        semestar.dodajPredmet(p5);
        semestar.dodajPredmet(p6);
        izborni.add(p6);
        ciklus.upisiStudentaUSemestar(s,semestar,izborni);
        //student bi trebao biti na spisku svih predmeti.getStudentiNaPredmetu
        assertAll ( "test",
                () -> assertTrue( semestar.getPredmeti().get(0).getStudentiNaPredmetu().containsKey(s)),
                () -> assertTrue( semestar.getPredmeti().get(1).getStudentiNaPredmetu().containsKey(s)),
                () -> assertTrue( semestar.getPredmeti().get(2).getStudentiNaPredmetu().containsKey(s)),
                () -> assertTrue( semestar.getPredmeti().get(3).getStudentiNaPredmetu().containsKey(s)),
                () -> assertTrue( semestar.getPredmeti().get(4).getStudentiNaPredmetu().containsKey(s)),
                () -> assertTrue( semestar.getPredmeti().get(5).getStudentiNaPredmetu().containsKey(s))
        );
    }

    @Test
    void dajPrepisOcjenaTest() {
        Fakultet f=new Fakultet();
        CiklusStudija ciklus=new CiklusStudija(1);
        f.dodajCiklus(ciklus);
        Semestar semestar=new Semestar(3);
        ciklus.dodajSemestar(semestar);
        Student s=new Student("Ja","Ja",18491);
        Predmet p1=new Predmet(1,"Algoritmi i strukture podataka",5,60,true);
        Predmet p2=new Predmet(2,"Logički dizajn",5,60,true);
        Predmet p3=new Predmet(3,"Razvoj programskih rješenja",5,60,true);
        Predmet p4=new Predmet(4,"Osnove baza podataka",5,60,true);
        Predmet p5=new Predmet(5,"Diskretna matematika",5,60,true);
        Predmet p6=new Predmet(6,"Sistemsko programiranje",5,60,false);
        List<Predmet> izborni=new ArrayList<>();
        semestar.dodajPredmet(p1);
        semestar.dodajPredmet(p2);
        semestar.dodajPredmet(p3);
        semestar.dodajPredmet(p4);
        semestar.dodajPredmet(p5);
        semestar.dodajPredmet(p6);
        izborni.add(p6);
        ciklus.upisiStudentaUSemestar(s,semestar,izborni);
        p5.upisiOcjenu(s,8);
        p6.upisiOcjenu(s,9);
        p2.upisiOcjenu(s,8);
        ciklus.dajPrepisOcjena(s,semestar);

        assertAll ( "test",
                () -> assertEquals(5,ciklus.dajPrepisOcjena(s,semestar).get(p1.getNaziv())),
                () -> assertEquals(8, ciklus.dajPrepisOcjena(s,semestar).get(p2.getNaziv())),
                () -> assertEquals( 5,ciklus.dajPrepisOcjena(s,semestar).get(p3.getNaziv())),
                () -> assertEquals(5,ciklus.dajPrepisOcjena(s,semestar).get(p4.getNaziv())),
                () -> assertEquals(8,ciklus.dajPrepisOcjena(s,semestar).get(p5.getNaziv())),
                () -> assertEquals(9,ciklus.dajPrepisOcjena(s,semestar).get(p6.getNaziv()))
        );
    }
}