package ba.unsa.etf.rpr;
//NAPRAVITI MAPE ZA SVE PODATKE ZA LAKSI INTERFEJS!!!!!!!!!!!!!!!!!!!!!

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static Map<Integer,Profesor> profesori;
    public static Map<Integer,Student> studenti;
    public static Map<Integer,Predmet> predmeti;
    public static Map<Integer,Semestar> semestri;
    public static List<Predmet> izborni;
    public static Map<Integer,CiklusStudija> ciklusi;
    public static Fakultet etf=new Fakultet();

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
    profesori.put(1,p01);
    profesori.put(2,p02);
    profesori.put(3,p03);
    profesori.put(4,p04);
    profesori.put(5,p05);
    profesori.put(6,p06);
    profesori.put(7,p07);
    profesori.put(8,p08);
    profesori.put(9,p09);
    profesori.put(10,p010);
    //studenti
    Student s01=new Student("Meho","Mehic",19272);
    Student s02=new Student("Pero","Peric",19273);
    Student s03=new Student("Selma","Selmic",19274);
    Student s04=new Student("Ana","Anic",19275);
    Student s05=new Student("Azra","Azric",19276);
    studenti=new HashMap<>();
    studenti.put(19272,s01);
    studenti.put(19273,s02);
    studenti.put(19274,s03);
    studenti.put(19275,s04);
    studenti.put(19276,s05);
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
    predmeti.put(1,p1);
    predmeti.put(2,p2);
    predmeti.put(3,p3);
    predmeti.put(4,p4);
    predmeti.put(5,p5);
    predmeti.put(6,p6);
    predmeti.put(7,p7);
    predmeti.put(8,p8);
    predmeti.put(9,p9);
    predmeti.put(10,p10);
    predmeti.put(11,p11);
    predmeti.put(12,p12);
    predmeti.put(13,p13);

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
    semestri.put(3,s3);
    semestri.put(4,s4);
    //ciklus studija
    CiklusStudija c1=new CiklusStudija(1);
    c1.dodajSemestar(s3);
    c1.dodajSemestar(s4);
    ciklusi=new HashMap<>();
    ciklusi.put(1,c1);

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

    public static void main(String[] args) {
        postavka();

        int odabir=0;
        Scanner ulaz=new Scanner(System.in);
        do {
            System.out.println("Odabir opcije: ");
            System.out.println("1. Daj spisak profesora na fakultetu koji nemaju normu ili rade preko norme");
            System.out.println("2. Daj spisak profesora sortiranih po normi");
            System.out.println("3. Daj spisak profesora sortiranih po ukupnom broju studenata koji pohađaju njihove predmete");
            System.out.println("4. Daj prepis ocjena za studenta");
            System.out.println("5. Upisi studenta u semestar");
            System.out.println("6. Upisi ocjenu");
        odabir=ulaz.nextInt();
            if (odabir == 1) {
                List<Profesor> profesoriVanNorme = new ArrayList<>();
                profesoriVanNorme = etf.getProfesoriVanNorme();
                Stream<Profesor> stream = profesoriVanNorme.stream();
                stream.forEach(p -> System.out.println(p.getIme() + " " + p.getPrezime() + " " + p.dajNormu()));
            } else if (odabir == 2) {
                List<Profesor> sortiranaLista = new ArrayList<>();
                sortiranaLista = etf.sortirajPoNormi();
                Stream<Profesor> stream2 = sortiranaLista.stream();
                stream2.forEach(p -> System.out.println(p.getIme() + " " + p.getPrezime() + " " + p.dajNormu()));
            } else if (odabir == 3) {
                List<Profesor> poBrojuStudenata = new ArrayList<>();
                poBrojuStudenata = etf.sortirajPoBrojuStudenata();
                Stream<Profesor> stream3 = poBrojuStudenata.stream();
                stream3.forEach(p -> System.out.println(p.getIme() + " " + p.getPrezime() + " " + p.ukupanBrojStudenataNaPredmetima()));
            } else if (odabir == 4) {
                System.out.println("Unesite indeks studenta za kojeg želite dobiti prepis ocjena:");
                int indeks = 0;
                indeks = ulaz.nextInt();
                Student st = studenti.get(indeks);
                System.out.println("Unesite ciklus i semestar za koji zelite dobiti prepis ocjena za unesenog studenta:");
                int ciklus = 0, semestar = 0;
                ciklus = ulaz.nextInt();
                semestar = ulaz.nextInt();
                CiklusStudija c = ciklusi.get(ciklus);
                Semestar s = semestri.get(semestar);
                Map<String, Integer> prepisOcjena = c.dajPrepisOcjena(st, s);
                if (!prepisOcjena.isEmpty())
                    for (Map.Entry<String, Integer> m : prepisOcjena.entrySet()) {
                        System.out.println(m.getKey() + " " + m.getValue());
                    }
                else System.out.println("Student nije upisan u odabrani semestar!");
            } else if (odabir == 5) {
                System.out.println("Unesite ciklus studija i semestar u koji želite upisati studenta: ");
                int ciklus = 0, semestar = 0;
                ciklus = ulaz.nextInt();
                semestar = ulaz.nextInt();
                System.out.println("Unesite indeks studenta kojeg želite upisati u semestar: ");
                int indeks = 0;
                indeks = ulaz.nextInt();
                System.out.println("Unesite šifre izbornih predmeta u semestru (0 za kraj izbora): ");
                int izbor = 0;
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
                int predmet=0,student=0,ocjena=0;
                System.out.println("Unesite šifru predmeta iz kojeg želite upisati ocjenu: ");
                predmet=ulaz.nextInt();
                System.out.println("Unesite indeks studenta kojem želite upisati ocjenu: ");
                student=ulaz.nextInt();
                System.out.println("Unesite ocjenu: ");
                ocjena=ulaz.nextInt();
                try {
                    predmeti.get(predmet).upisiOcjenu(studenti.get(student), ocjena);
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }while(odabir!=0);
        //DODATI TRY CATCH ZA IZUZETKE
    }

}
