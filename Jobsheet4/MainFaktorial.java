package Jobsheet4;

import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) { // method utama (main)
        Scanner sc = new Scanner(System.in); // input dari user

        System.out.print("Masukkan angka: ");
        int n = sc.nextInt(); // input angka

        Faktorial f = new Faktorial(); // membuat objek

        // output hasil
        System.out.println("Hasil Faktorial BF: " + f.faktorialBF(n));
        System.out.println("Hasil Faktorial DC: " + f.faktorialDC(n));

        sc.close();
    }
}
