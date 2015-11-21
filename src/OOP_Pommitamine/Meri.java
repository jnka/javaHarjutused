package OOP_Pommitamine;

/**
 * Created by janikaa on 21.11.2015.
 */
public class Meri {
    private int lauaServaPikkus;
    private Laev [] laevastik=new Laev[5];

    public Meri(int pikkus) {
        lauaServaPikkus=pikkus;
        tekitaLaevastik();
    }

    private void tekitaLaevastik() {//Massiiv
        for (int i=0; i<laevastik.length; i++){
            laevastik[i]=new Laev(i+1, lauaServaPikkus);
        }
    }

    public boolean laevuOnAlles() {
        for (int i = 0; i < laevastik.length; i++) {
            boolean elus=laevastik[i].oledElus();
            if (elus){
                return true;
            }

        }
        return false;
    }
}
