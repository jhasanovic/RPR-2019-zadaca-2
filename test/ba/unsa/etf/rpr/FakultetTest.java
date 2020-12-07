package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FakultetTest {
    private static List<Profesor> profesori;
    private static Fakultet f=new Fakultet();

    @Test
    void konstruktorFakultetTest() {
        Fakultet f=new Fakultet();
        assertAll ( "konstruktor",
                () -> assertEquals( 0,f.getCiklusi().size() ),
                () -> assertEquals( 0,f.getProfesori().size() )
        );
    }

    @Test
    void dodajCiklusTest() {
    CiklusStudija ciklus=new CiklusStudija(1);
    CiklusStudija ciklus2=new CiklusStudija(2);
    CiklusStudija ciklus3=new CiklusStudija(3);
    f.dodajCiklus(ciklus);
    f.dodajCiklus(ciklus2);
    f.dodajCiklus(ciklus3);
    assertEquals(3,f.getCiklusi().size());
    }

    @Test
    void dodajProfesoraTest() {
        Profesor p=new Profesor(1,"A","B");
        f.dodajProfesora(p);
        assertEquals("B",f.getProfesori().get(0).getPrezime());
    }

    @Test
    void getProfesoriVanNormeTest() {
        Fakultet f=new Fakultet();
        Profesor p=new Profesor(1,"A","B");
        Profesor p2=new Profesor(2,"C","D");
        Profesor p3=new Profesor(3,"E","F");
        f.dodajProfesora(p);
        f.dodajProfesora(p2);
        f.dodajProfesora(p3);
        Predmet pr=new Predmet(1,"RPR",5,60,true);
        Predmet pr2=new Predmet(2,"DM",5,60,true);
        Student s=new Student("Ja","Ja",1281);
        pr.upisiStudentaNaPredmet(s);
        pr2.upisiStudentaNaPredmet(s);
        p.dodajPredmet(pr);
        p.dodajPredmet(pr2);
        assertEquals(2,f.getProfesoriVanNorme().size());
    }
    @Test
    void getProfesoriTest() {
        Fakultet f=new Fakultet();
        assertTrue(f.getProfesori().size()==0);
    }
    @Test
    void sortirajPoNormiTest() {
        //max to min
        Fakultet f=new Fakultet();
        Profesor p=new Profesor(1,"A","B");
        Profesor p2=new Profesor(2,"C","D");
        Profesor p3=new Profesor(3,"E","F");
        f.dodajProfesora(p);
        f.dodajProfesora(p2);
        f.dodajProfesora(p3);
        Predmet pr=new Predmet(1,"RPR",5,60,true);
        Predmet pr2=new Predmet(2,"DM",5,60,true);
        Predmet pr3=new Predmet(3,"ASP",5,60,true);
        Student s=new Student("Ja","Ja",1281);
        pr.upisiStudentaNaPredmet(s);
        pr2.upisiStudentaNaPredmet(s);
        pr3.upisiStudentaNaPredmet(s);
        p3.dodajPredmet(pr);
        p3.dodajPredmet(pr2);
        p2.dodajPredmet(pr3);
        //p bi trebao imati normu 0, p2 60, a p3 120

        assertAll ( "sortirajPoNormi",
                () -> assertEquals( 3,f.sortirajPoNormi().get(0).getIdProfesora() ),
                () -> assertEquals( 2,f.sortirajPoNormi().get(1).getIdProfesora() ),
                () -> assertEquals( 1,f.sortirajPoNormi().get(2).getIdProfesora() )
        );
    }

    @Test
    void sortirajPoBrojuStudenataTest() {
        //max to min
        Fakultet f=new Fakultet();
        Profesor p=new Profesor(1,"A","B");
        Profesor p2=new Profesor(2,"C","D");
        Profesor p3=new Profesor(3,"E","F");
        f.dodajProfesora(p);
        f.dodajProfesora(p2);
        f.dodajProfesora(p3);
        Predmet pr=new Predmet(1,"RPR",5,60,true);
        Predmet pr2=new Predmet(2,"DM",5,60,true);
        Predmet pr3=new Predmet(3,"ASP",5,60,true);
        Predmet pr4=new Predmet(4,"SP",5,60,false);
        Student s=new Student("Ja","Ja",1281);
        pr.upisiStudentaNaPredmet(s);
        pr2.upisiStudentaNaPredmet(s);
        p3.dodajPredmet(pr);
        p3.dodajPredmet(pr2);
        p2.dodajPredmet(pr3);//na ovaj predmet niko nije upisan
        p.dodajPredmet(pr4);//na ovaj predmet niko nije upisan
        //p bi trebao imati 0, p2 0, p3 2
        List<Profesor> moguciTacni = new ArrayList<>();
        moguciTacni.add(p);
        moguciTacni.add(p2);
        assertAll ( "sortirajPoBrojuStudenata",
                () -> assertEquals( 3,f.sortirajPoBrojuStudenata().get(0).getIdProfesora() ),
                () -> assertTrue(moguciTacni.contains(f.sortirajPoBrojuStudenata().get(1))),
                () -> assertTrue(moguciTacni.contains(f.sortirajPoBrojuStudenata().get(2)))
                );
    }
}