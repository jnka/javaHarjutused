package OOP_Pommitamine;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by janikaa on 21.11.2015.
 */
public class Laev {
    private int laevaPikkus;
    private int[] koordinaadid;
    private boolean elus = true;

    public Laev(int pikkus, int lauaServaPikkus) {
        laevaPikkus=pikkus;
        genereeriKoordinaadid(lauaServaPikkus);

    }

    private void genereeriKoordinaadid(int lauaServaPikkus) {
        Random rand=new Random();
        int x=rand.nextInt(lauaServaPikkus);
        int y=rand.nextInt(lauaServaPikkus);
        koordinaadid=new int[]{x, y};


    }

    public boolean oledElus() {
          return elus;
    }
}
