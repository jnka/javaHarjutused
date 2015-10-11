package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        int[] laud = {1, 1, 1, 0, 0, 1, 0, 0, 1}; //[] näitab numbrite massiiivi, laua lugemine: 0, 1, 2, 3, jne.
        System.out.println(Arrays.toString(laud));//võtab laua, teeb massivist teksti ja prindib välja selle ühe reana;

        Scanner kasutaja = new Scanner(System.in); //kasutajalt info küsimine
        while (gameover(laud)) {
            System.out.println("Sisesta üks number");//prindib kasutajale küsimuse välja
            int sisestus = kasutaja.nextInt();//kasutaja sisestus (numbriline)
            int hit = laud[sisestus]; //
            if (hit == 0) {
                System.out.println("Möödas!");
            } else if (hit == 1) {
                System.out.println("Pihtas!");
                laud[sisestus] = 2;
            } else if (hit == 2) {
                System.out.println("Juba lasid selle põhja, proovi uuesti!");
            }
        }
        System.out.println("Jee, võitsid!!!");
    }
    public static boolean gameover(int[] laud){//Kontrollib, kas 1 on veel lauas ja annab vastuseks true või false. Kui enam ühtegi 1-te pole, siis lõpetab mängu.
        for (int i = 0; i < laud.length; i++) {//int i = 0 - näitab ära alguse; i < laud.length - kaua kestab mäng,määrab ära laua pikkuse,  i++ - lisab alati juurde kuni laua lõpuni.
            if (laud[i] == 1) {
                return true;
            }
        }

        return false;
    }
}
