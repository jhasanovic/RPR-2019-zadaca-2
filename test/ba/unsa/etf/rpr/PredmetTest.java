package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void konstruktorPredmetTest() {
        Predmet p=new Predmet(1,"Razvoj programskih rješenja",5,60,true);
        assertAll ( "konstruktor",
                () -> assertEquals( "Razvoj programskih rješenja", p.getNaziv()),
                () -> assertEquals( 1, p.getIdPredmeta()),
                () -> assertEquals( 5, p.getBrojEcts()),
                () -> assertEquals( 60, p.getBrojSatiUSemestru()),
                () -> assertEquals( true, p.isObavezniPredmet())
        );
    }


    @Test
    void upisiStudentaNaPredmetTest() {
        Student s=new Student("Jasmina","Hasanović",18491);
        Predmet p=new Predmet(1,"Razvoj programskih rješenja",5,60,true);
        p.upisiStudentaNaPredmet(s);
        assertEquals(p.getStudentiNaPredmetu().get(s),5);
    }
    @Test
    void upisiOcjenuTest() {
        Student s=new Student("Niko","Nikić",19270);
        Predmet p=new Predmet(5,"Diskretna matematika",5,60,true);
        p.upisiStudentaNaPredmet(s);
        p.upisiOcjenu(s,8);
        assertEquals(p.getStudentiNaPredmetu().get(s),8);
    }
    @Test
    void izuzetakTest1() {
        Student s=new Student("Niko","Nikić",11193);
        Predmet p=new Predmet(3,"Logički dizajn",5,60,true);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () ->  p.upisiOcjenu(s,4));

        assertEquals("Student nije upisan na predmet!", exception.getMessage());
    }

    @Test
    void izuzetakTest2() {
        Student s=new Student("Jasmina","Hasanović",18491);
        Predmet p=new Predmet(1,"Razvoj programskih rješenja",5,60,true);
        p.upisiStudentaNaPredmet(s);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () ->  p.upisiOcjenu(s,4));

        assertEquals("Nelegalna vrijednost ocjene!", exception.getMessage());
    }
    @Test
    void izuzetakTest3() {
        Student s=new Student("Niko","Nikić",11193);
        Predmet p=new Predmet(3,"Logički dizajn",5,60,true);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () ->  p.upisiOcjenu(s,8));

        assertEquals("Student nije upisan na predmet!", exception.getMessage());
    }
    @Test
    void praznaMapaStudentiNaPredmetuTest() {
        Predmet p=new Predmet(3,"Logički dizajn",5,60,true);
        assertTrue(p.getStudentiNaPredmetu().isEmpty());
    }
    @Test
    void studentNijeUpisanNaPredmetTest() {
        Student s=new Student("Niko","Nikić",11193);
        Student s2=new Student("Neko","Nekić",11190);
        Predmet p=new Predmet(3,"Logički dizajn",5,60,true);
        p.upisiStudentaNaPredmet(s2);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () ->  p.upisiOcjenu(s,5));
        assertEquals("Student nije upisan na predmet!", exception.getMessage());
    }
}