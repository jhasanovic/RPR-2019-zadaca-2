package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfesorTest {

    @Test
    void konstruktorProfesorTest() {
        Profesor p=new Profesor(1,"Vedran","Ljubović");
        assertAll ( "konstruktor",
                () -> assertEquals( 1, p.getIdProfesora()),
                () -> assertEquals( "Vedran", p.getIme()),
                () -> assertEquals( "Ljubović", p.getPrezime())
        );
    }
    @Test
    void dajNormuTest() {
        Predmet pr=new Predmet(1,"Razvoj programskih rješenja",5,60,true);
        Profesor p=new Profesor(1,"Vedran","Ljubović");
        p.dodajPredmet(pr);
    assertEquals(0,p.dajNormu()); //jer nijedan student nije upisao taj predmet
    }

    @Test
    void dajUkupanBrojStudenataNaPredmetimaTest() {
        Predmet pr=new Predmet(1,"Razvoj programskih rješenja",5,60,true);
        Profesor p=new Profesor(1,"Vedran","Ljubović");
        p.dodajPredmet(pr);
        Student s=new Student("Jasmina","Hasanović",18491);
        pr.upisiStudentaNaPredmet(s);
        assertEquals(1,p.ukupanBrojStudenataNaPredmetima());
    }

}