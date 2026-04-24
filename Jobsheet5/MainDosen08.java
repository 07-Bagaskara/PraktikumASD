package Jobsheet5;

import java.util.Scanner;

public class MainDosen08 {

    public static void main(String[] args) { // main

        Scanner sc = new Scanner(System.in);
        DataDosen08 data = new DataDosen08();

        int pilih;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah");
            System.out.println("2. Tampil");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("0. Keluar");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("JK (true=Pria): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    data.tambah(new Dosen08(kd, nama, jk, usia));
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;
            }

        } while (pilih != 0);
        sc.close();
    }
}