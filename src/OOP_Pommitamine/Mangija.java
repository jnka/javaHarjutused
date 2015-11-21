package OOP_Pommitamine;

import java.util.Scanner;

/**
 * Created by janikaa on 21.11.2015.
 */
public class Mangija {
   private Scanner sc=new Scanner(System.in);


    public int[] kuhuLasta() {
        System.out.println("sisesta koordinaadid, kuhu sihtida stiilis: vert-horis");
        String[] input =sc.nextLine().split("-");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        return new int[]{x, y};
    }

    public void pihtas() {
        System.out.println("Said pihta!");
    }

    public void moodas() {
        System.out.println("Läks mööda");
    }

    public void gameover() {
        System.out.println("Mäng läbi");
    }
}
