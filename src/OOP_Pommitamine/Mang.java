package OOP_Pommitamine;

/**
 * Created by janikaa on 21.11.2015.
 */
public class Mang {
    public Mang(){
        // 1. Mängu seaustada
         Meri meri= new Meri(10); //uus laud, objekt
        Mangija mangija = new Mangija(); //objekt

        //2. Mängu töös hoidmine, tsükliga
        while(meri.laevuOnAlles()){
            meri.kuvaLaud();
            int[] lask = mangija.kuhuLasta();
            boolean pihtas=meri.saiPihta(lask);//küsib mere käest, kas keegi sai pihta?
            if (pihtas) {
                mangija.pihtas();
            }else{
                mangija.moodas();
            }

        }

       // 3. Kui mäng on läbi, mis saab?
        mangija.gameover();


    }
}