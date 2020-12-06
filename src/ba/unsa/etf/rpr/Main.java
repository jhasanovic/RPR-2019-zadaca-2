package ba.unsa.etf.rpr;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //u svakoj klasi omoguciti dodavanje elemenata kolekcijom
        //nakon toga omoguciti naknadno dodavanje jednog po jednog elementa
        //student je upisan na predmete koji su u tom trenutku dostupni
        //String idProfesora,String ime, String prezime, List<Predmet> predmeti
        //int idPredmeta, String naziv, int brojEcts, int brojSatiUSemestru, boolean obavezniPredmet,Profesor p
        //profesori
        Profesor p01=new Profesor(1,"Haris","Šupić");
        Profesor p02=new Profesor(2,"Novica","Nosović");
        Profesor p03=new Profesor(3,"Vedran","Ljubović");
        Profesor p04=new Profesor(4,"Emir","Buza");
        Profesor p05=new Profesor(5,"Željko","Jurić");
        Profesor p06=new Profesor(6,"Samir","Ribić");
        Profesor p07=new Profesor(7,"Vensada","Okanović");
        Profesor p08=new Profesor(8,"Dženana","Đonko");
        //studenti
        Student s01=new Student("Meho","Mehic",19272);
        Student s02=new Student("Pero","Peric",19273);
        Student s03=new Student("Selma","Selmic",19274);
        Student s04=new Student("Ana","Anic",19275);
        Student s05=new Student("Azra","Azric",19276);
        //predmeti
        Predmet p1=new Predmet(1,"Algoritmi i strukture podataka",5,60,true);
        Predmet p2=new Predmet(2,"Logički dizajn",5,60,true);
        Predmet p3=new Predmet(3,"Razvoj programskih rješenja",5,60,true);
        Predmet p4=new Predmet(4,"Osnove baza podataka",5,60,true);
        Predmet p5=new Predmet(5,"Diskretna matematika",5,60,true);
        Predmet p6=new Predmet(6,"Sistemsko programiranje",5,60,false);
        Predmet p7=new Predmet(7,"Numerički algoritmi",5,60,false);
        Predmet p8=new Predmet(8,"Objektno orijentisana analiza i dizajn",5,60,true);
        Predmet p9=new Predmet(9,"Automati i formalni jezici",5,60,true);
        Predmet p10=new Predmet(10,"Razvoj mobilnih aplikacija",5,60,false);
        //semestri
        Semestar s3=new Semestar(3);
        s3.dodajPredmet(p1);
        s3.dodajPredmet(p2);
        s3.dodajPredmet(p3);
        s3.dodajPredmet(p4);
        s3.dodajPredmet(p5);
        s3.dodajPredmet(p6);
        s3.dodajPredmet(p7);
        Semestar s4=new Semestar(4);
        s4.dodajPredmet(p8);
        s4.dodajPredmet(p9);
        s4.dodajPredmet(p10);
        //ciklus studija
        CiklusStudija c1=new CiklusStudija(1);
        c1.dodajSemestar(s3);
        c1.dodajSemestar(s4);
        //fakultet
        Fakultet etf=new Fakultet();
        etf.dodajCiklus(c1);
        etf.dodajProfesora(p01);
        etf.dodajProfesora(p02);
        etf.dodajProfesora(p03);
        etf.dodajProfesora(p04);
        etf.dodajProfesora(p05);
        etf.dodajProfesora(p06);
        etf.dodajProfesora(p07);
        etf.dodajProfesora(p08);
        //dodjela predmeta profesorima
        p01.dodajPredmet(p1);
        p01.dodajPredmet(p9);
        p02.dodajPredmet(p2);
        p03.dodajPredmet(p3);
        p04.dodajPredmet(p4);
        p05.dodajPredmet(p5);
        p05.dodajPredmet(p7);
        p06.dodajPredmet(p6);
        p07.dodajPredmet(p8);
        p08.dodajPredmet(p10);
        //upis studenata na predmete
        p1.upisiStudentaNaPredmet(s01);
        p9.upisiStudentaNaPredmet(s01);
        List<Profesor> profesoriVanNorme=new ArrayList<>();
        profesoriVanNorme=etf.getProfesoriVanNorme();
        Stream<Profesor> stream=profesoriVanNorme.stream();
        stream.forEach(p-> System.out.println(p.getIme()+" "+p.getPrezime()+" "+p.dajNormu()));

        System.out.println();
        List<Profesor> sortiranaLista=new ArrayList<>();
        sortiranaLista=etf.sortirajPoNormi();
        Stream<Profesor> stream2=sortiranaLista.stream();
        stream2.forEach(p-> System.out.println(p.getIme()+" "+p.getPrezime()+" "+p.dajNormu()));
        System.out.println();
        List<Profesor> poBrojuStudenata=new ArrayList<>();
        poBrojuStudenata=etf.sortirajPoBrojuStudenata();
        Stream<Profesor> stream3=poBrojuStudenata.stream();
        stream3.forEach(p-> System.out.println(p.getIme()+" "+p.getPrezime()+" "+p.ukupanBrojStudenataNaPredmetima()));

        //upis ocjena
        p1.upisiOcjenu(s01,8);
        p2.upisiOcjenu(s01,9);
        p7.upisiOcjenu(s01,6);
        p10.upisiOcjenu(s01,10);
    }

}
