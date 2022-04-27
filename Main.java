package Mayin_Tarlasi;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int f,o;
        System.out.print("Satýr Büyk: ");
        int a = s.nextInt();
        System.out.print("Sütün Büyü: ");
        int b = s.nextInt();
        Matris ilk = new Matris(a,b);

        ilk.Tire();
        ilk.Mayin(ilk);

        do {
            System.out.print("Satýrýnýz : ");
             f = s.nextInt();
           System.out.print("Sütununuz : ");
             o = s.nextInt();
        } while(ilk.Tarama(f,o));

    }
}
