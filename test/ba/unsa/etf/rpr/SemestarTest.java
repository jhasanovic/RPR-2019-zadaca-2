package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SemestarTest {

    Predmet p = new Predmet(1,"Predmet",5,60,true);
    Predmet p2 = new Predmet(2,"Predmet2",5,60,true);
    Predmet p3 = new Predmet(3,"Predmet3",5,60,false);
    @Test
    void konstruktorSemestarTest() {
    Semestar s = new Semestar(1);
        assertEquals(1, s.getIdSemestra());
    }
    @Test
    void dodajPredmetTest() {
    Semestar s = new Semestar(1);
    List<Predmet> predmeti=new ArrayList<>();
    s.dodajPredmet(p);
    predmeti.add(p);
    assertEquals(predmeti.size(),s.getPredmeti().size());
    }
    @Test
    void zbirECTSObaveznihTest() {
        Semestar s=new Semestar(1);
        s.dodajPredmet(p);
        s.dodajPredmet(p2);
        s.dodajPredmet(p3);
        assertEquals(10,s.dajUkupanBrojECTSObaveznih());
    }
}