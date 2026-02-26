package Jobsheet1;

import java.util.Scanner;

public class PlatMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] KODE = {"B", "D", "L", "N", "T",
                         "AB", "AD", "AE", "F", "Z"};

        String[] KOTA = {"Jakarta", "Bandung", "Surabaya", "Malang", "Tegal",
                         "Yogyakarta", "Solo", "Madiun", "Bogor", "Garut"};

        System.out.print("Masukkan Kode Plat: ");
        String kode = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (kode.equalsIgnoreCase(KODE[i])) {
                System.out.println("Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");
        }sc.close();
    }
}