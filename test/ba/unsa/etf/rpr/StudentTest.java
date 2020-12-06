package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @org.junit.jupiter.api.Test
    void konstruktorStudent() {
        Student s=new Student("Jasmina","Hasanović",18491);
        assertAll ( "konstruktor",
                () -> assertEquals( "Jasmina", s.getIme()),
                () -> assertEquals( "Hasanović", s.getPrezime()),
                () -> assertEquals( 18491, s.getBrojIndeksa())
        );
    }

}