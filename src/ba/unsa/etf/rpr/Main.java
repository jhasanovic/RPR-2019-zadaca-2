package ba.unsa.etf.rpr;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    protected static Map<Integer,Profesor> profesori;
    protected static Map<Integer,Student> studenti;
    protected static Map<Integer,Predmet> predmeti;
    protected static Map<Integer,Semestar> semestri;
    protected static List<Predmet> izborni;
    protected static Map<Integer,CiklusStudija> ciklusi;
    protected static Fakultet etf=new Fakultet();

public static void postavka(){
    Profesor p01=new Profesor(1,"Haris","Šupić");
    Profesor p02=new Profesor(2,"Novica","Nosović");
    Profesor p03=new Profesor(3,"Vedran","Ljubović");
    Profesor p04=new Profesor(4,"Emir","Buza");
    Profesor p05=new Profesor(5,"Željko","Jurić");
    Profesor p06=new Profesor(6,"Samir","Ribić");
    Profesor p07=new Profesor(7,"Vensada","Okanović");
    Profesor p08=new Profesor(8,"Dženana","Đonko");
    Profesor p09=new Profesor(9,"Kemal","Hajdarević");
    Profesor p010=new Profesor(10,"Samim","Konjicija");
    profesori=new HashMap<>();
    profesori.put(p01.getIdProfesora(),p01);
    profesori.put(p02.getIdProfesora(),p02);
    profesori.put(p03.getIdProfesora(),p03);
    profesori.put(p04.getIdProfesora(),p04);
    profesori.put(p05.getIdProfesora(),p05);
    profesori.put(p06.getIdProfesora(),p06);
    profesori.put(p07.getIdProfesora(),p07);
    profesori.put(p08.getIdProfesora(),p08);
    profesori.put(p09.getIdProfesora(),p09);
    profesori.put(p010.getIdProfesora(),p010);
    //studenti
    Student s01=new Student("Meho","Mehic",19272);
    Student s02=new Student("Pero","Peric",19273);
    Student s03=new Student("Selma","Selmic",19274);
    Student s04=new Student("Ana","Anic",19275);
    Student s05=new Student("Azra","Azric",19276);
    studenti=new HashMap<>();
    studenti.put(s01.getBrojIndeksa(),s01);
    studenti.put(s02.getBrojIndeksa(),s02);
    studenti.put(s03.getBrojIndeksa(),s03);
    studenti.put(s04.getBrojIndeksa(),s04);
    studenti.put(s05.getBrojIndeksa(),s05);
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
    Predmet p11=new Predmet(11,"Računarske arhitekture",5,60,true);
    Predmet p12=new Predmet(12,"Osnove računarskih mreža",5,60,true);
    Predmet p13=new Predmet(13,"Ugradbeni sistemi",5,60,false);
    predmeti=new HashMap<>();
    predmeti.put(p1.getIdPredmeta(),p1);
    predmeti.put(p2.getIdPredmeta(),p2);
    predmeti.put(p3.getIdPredmeta(),p3);
    predmeti.put(p4.getIdPredmeta(),p4);
    predmeti.put(p5.getIdPredmeta(),p5);
    predmeti.put(p6.getIdPredmeta(),p6);
    predmeti.put(p7.getIdPredmeta(),p7);
    predmeti.put(p8.getIdPredmeta(),p8);
    predmeti.put(p9.getIdPredmeta(),p9);
    predmeti.put(p10.getIdPredmeta(),p10);
    predmeti.put(p11.getIdPredmeta(),p11);
    predmeti.put(p12.getIdPredmeta(),p12);
    predmeti.put(p13.getIdPredmeta(),p13);

    //semestri
    semestri=new HashMap<>();
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
    s4.dodajPredmet(p11);
    s4.dodajPredmet(p12);
    s4.dodajPredmet(p13);
    semestri.put(s3.getIdSemestra(),s3);
    semestri.put(s4.getIdSemestra(),s4);
    //ciklus studija
    CiklusStudija c1=new CiklusStudija(1);
    c1.dodajSemestar(s3);
    c1.dodajSemestar(s4);
    ciklusi=new HashMap<>();
    ciklusi.put(c1.getIdCiklusa(),c1);

    //fakultet
    etf.dodajCiklus(c1);
    etf.dodajProfesora(p01);
    etf.dodajProfesora(p02);
    etf.dodajProfesora(p03);
    etf.dodajProfesora(p04);
    etf.dodajProfesora(p05);
    etf.dodajProfesora(p06);
    etf.dodajProfesora(p07);
    etf.dodajProfesora(p08);
    etf.dodajProfesora(p09);
    etf.dodajProfesora(p010);
    //dodjela predmeta profesorima
    p01.dodajPredmet(p1);
    p01.dodajPredmet(p9);
    p02.dodajPredmet(p2);
    p02.dodajPredmet(p11);
    p03.dodajPredmet(p3);
    p04.dodajPredmet(p4);
    p05.dodajPredmet(p5);
    p05.dodajPredmet(p7);
    p06.dodajPredmet(p6);
    p07.dodajPredmet(p8);
    p08.dodajPredmet(p10);
    p09.dodajPredmet(p12);
    p010.dodajPredmet(p13);

}

//Unositi vrijednosti koje postoje u postavci
    public static void main(String[] args) {
        postavka();
        int odabir;
        Scanner ulaz=new Scanner(System.in);
        do {
            System.out.println("Odabir opcije (0 za izlaz): ");
            System.out.println("1. Daj spisak profesora na fakultetu koji nemaju normu ili rade preko norme");
            System.out.println("2. Daj spisak profesora sortiranih po normi");
            System.out.println("3. Daj spisak profesora sortiranih po ukupnom broju studenata koji pohađaju njihove predmete");
            System.out.println("4. Daj prepis ocjena za studenta");
            System.out.println("5. Upisi studenta u semestar");
            System.out.println("6. Upisi ocjenu");
        odabir=ulaz.nextInt();
            if (odabir == 1) {
                List<Profesor> profesoriVanNorme = etf.getProfesoriVanNorme();
                Stream<Profesor> stream = profesoriVanNorme.stream();
                stream.forEach(p -> System.out.println(p.getIme() + " " + p.getPrezime() + " " + p.dajNormu()));
            } else if (odabir == 2) {
                List<Profesor> sortiranaLista = etf.sortirajPoNormi();
                Stream<Profesor> stream2 = sortiranaLista.stream();
                stream2.forEach(p -> System.out.println(p.getIme() + " " + p.getPrezime() + " " + p.dajNormu()));
            } else if (odabir == 3) {
                List<Profesor> poBrojuStudenata = etf.sortirajPoBrojuStudenata();
                Stream<Profesor> stream3 = poBrojuStudenata.stream();
                stream3.forEach(p -> System.out.println(p.getIme() + " " + p.getPrezime() + " " + p.ukupanBrojStudenataNaPredmetima()));
            } else if (odabir == 4) {
                System.out.println("Unesite indeks studenta za kojeg želite dobiti prepis ocjena:");
                int indeks = ulaz.nextInt();
                Student st = studenti.get(indeks);
                System.out.println("Unesite ciklus i semestar za koji zelite dobiti prepis ocjena za unesenog studenta:");
                int ciklus = ulaz.nextInt();
                int semestar = ulaz.nextInt();
                CiklusStudija c = ciklusi.get(ciklus);
                Semestar s = semestri.get(semestar);
                Map<String, Integer> prepisOcjena = c.dajPrepisOcjena(st, s);
                if (!prepisOcjena.isEmpty()) {
                    prepisOcjena.entrySet().stream().forEach(m -> System.out.println(m.getKey() + " " + m.getValue()));
                }
                else System.out.println("Student nije upisan u odabrani semestar!");
            } else if (odabir == 5) {
                System.out.println("Unesite ciklus studija i semestar u koji želite upisati studenta: ");
                int ciklus = ulaz.nextInt();
                int semestar = ulaz.nextInt();
                System.out.println("Unesite indeks studenta kojeg želite upisati u semestar: ");
                int indeks = ulaz.nextInt();
                System.out.println("Unesite šifre izbornih predmeta u semestru (0 za kraj izbora): ");
                int izbor;
                izborni = new ArrayList<>();
                do {
                    izbor = ulaz.nextInt();
                    if (izbor == 0) continue;
                    izborni.add(predmeti.get(izbor));
                } while (izbor != 0);
                try {
                    ciklusi.get(ciklus).upisiStudentaUSemestar(studenti.get(indeks), semestri.get(semestar), izborni);
                }
                catch(IllegalStateException e){
                    System.out.println(e.getMessage());
                }
            } else if (odabir == 6) {
                System.out.println("Unesite šifru predmeta iz kojeg želite upisati ocjenu: ");
                int predmet=ulaz.nextInt();
                System.out.println("Unesite indeks studenta kojem želite upisati ocjenu: ");
                int student=ulaz.nextInt();
                System.out.println("Unesite ocjenu: ");
                int ocjena=ulaz.nextInt();
                try {
                    predmeti.get(predmet).upisiOcjenu(studenti.get(student), ocjena);
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }while(odabir!=0);
    }

}
