package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Semestar {
private int idSemestra;
private List<Predmet> predmeti;

    public Semestar(int idSemestra) {
        this.idSemestra = idSemestra;
        predmeti=new ArrayList<>();
    }

    public void dodajPredmet(Predmet predmet){
        predmeti.add(predmet);
    }
    public void upisiUSemestar(Student student, ArrayList<Predmet> predmeti){
        //student.upisiUSemestar(prvi ciklus,prvi semestar,listaIzbornihPredmeta)
        //upisati ga automatski na sve obavezne, a iz liste na izborne
        //ako nema dovoljno ects bodova ispisati "Neuspjesan upis u semestar: Nedovoljan broj ECTS bodova!"
        //"Neuspjesan upis u semestar: Nepostojeci broj semestra/ciklusa"
        //"Nepostojeca sifra predmeta"

        //ako je sve regularno, dodati studenta na svaki od predmeta
        //prema datom brSemestra naci sve obavezne predmete i upisati


        //KROZ SEMESTAR DOCI DO PREDMETA I UPISATI STUDENTA U MAPU
    }

    public int getIdSemestra() {
        return idSemestra;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }
}
