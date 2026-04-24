package Jobsheet4;

import java.util.Scanner;

public class MainLatihan {

    public static void main(String[] args) { // main
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int n = sc.nextInt();

        Nilai[] data = new Nilai[n]; // array object

        // input data
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai UTS: ");
            int uts = sc.nextInt();

            System.out.print("Nilai UAS: ");
            int uas = sc.nextInt();

            data[i] = new Nilai(uts, uas);
        }

        ProsesNilai p = new ProsesNilai(); // objek proses

        // output
        System.out.println("UTS Tertinggi: " + p.maxUTS(data, 0, n-1));
        System.out.println("UTS Terendah: " + p.minUTS(data, 0, n-1));
        System.out.println("Rata-rata UAS: " + p.rataUAS(data));

        sc.close();
    }
}