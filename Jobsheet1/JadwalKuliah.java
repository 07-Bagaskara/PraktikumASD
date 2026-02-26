package Jobsheet1;

import java.util.Scanner;

public class JadwalKuliah {

    static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i+1));
            System.out.print("Nama MK : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang   : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari    : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam     : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== Semua Jadwal ===");
        for (int i = 0; i < n; i++) {
            System.out.println(jadwal[i][0] + " | " +
                               jadwal[i][1] + " | " +
                               jadwal[i][2] + " | " +
                               jadwal[i][3]);
        }
    }

    static void cariHari(String[][] jadwal, int n, String hari) {
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " - " + jadwal[i][3]);
            }
        }
    }

    static void cariMK(String[][] jadwal, int n, String mk) {
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Hari: " + jadwal[i][2] +
                                   ", Jam: " + jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);
        tampilSemua(jadwal, n);

        System.out.print("\nCari berdasarkan hari: ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari berdasarkan MK: ");
        String mk = sc.nextLine();
        cariMK(jadwal, n, mk);
    }
}