package OOP_Pommitamine;

/**
 * Created by janikaa on 21.11.2015.
 */
public class Mang {
    public Mang(){
        // 1. M�ngu seaustada
         Meri meri= new Meri(10); //uus laud, objekt
        Mangija mangija = new Mangija(); //objekt

        //2. M�ngu t��s hoidmine, ts�kliga
        while(meri.laevuOnAlles()){
            meri.kuvaLaud();
            int[] lask = mangija.kuhuLasta();
            boolean pihtas=meri.saiPihta(lask);//k�sib mere k�est, kas keegi sai pihta?
            if (pihtas) {
                mangija.pihtas();
            }else{
                mangija.moodas();
            }

        }

       // 3. Kui m�ng on l�bi, mis saab?
        mangija.gameover();


    }
}