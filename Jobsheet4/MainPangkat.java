package Jobsheet4;

import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) { // method utama
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt(); // jumlah data

        Pangkat[] p = new Pangkat[n]; // array of object

        // input data
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai: ");
            int nilai = sc.nextInt();

            System.out.print("Masukkan pangkat: ");
            int pangkat = sc.nextInt();

            p[i] = new Pangkat(nilai, pangkat); // instansiasi objek
        }

        // output hasil
        for (int i = 0; i < n; i++) {
            System.out.println("Hasil BF: " + p[i].pangkatBF());
            System.out.println("Hasil DC: " + p[i].pangkatDC(p[i].nilai, p[i].pangkat));

            sc.close();
        }
    }
}