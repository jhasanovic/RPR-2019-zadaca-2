Nisu ispravljena SonarLint upozorenja kao sto su:

Replace this use of System.out or System.err by a logger;

Replace this lambda with a method reference, jer mislim da je u mojim slucajevima "false positive".

PMD prijavljuje neka krsenja pravila dobrog dizajna u Main klasi u kojoj su neke kolekcije inicijalizirane vrijednostima objekata klase samo radi kratkoce, da korisnik ne bi unosio i predmete i profesore i sl.