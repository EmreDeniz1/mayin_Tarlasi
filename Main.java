package Mayin_Tarlasi;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int f,o;
        System.out.print("Sat�r B�yk: ");
        int a = s.nextInt();
        System.out.print("S�t�n B�y�: ");
        int b = s.nextInt();
        Matris ilk = new Matris(a,b);

        ilk.Tire();
        ilk.Mayin(ilk);

        do {
            System.out.print("Sat�r�n�z : ");
             f = s.nextInt();
           System.out.print("S�tununuz : ");
             o = s.nextInt();
        } while(ilk.Tarama(f,o));

    }
}
