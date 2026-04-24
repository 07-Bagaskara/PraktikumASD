package Jobsheet6;

import java.util.Scanner;

// Class utama (main)
public class MahasiswaDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // input user

        MahasiswaBerprestasi list = new MahasiswaBerprestasi(); // objek utama

        // ================== INPUT DATA ==================
        list.tambah(new Mahasiswa("101", "Andi", "1A", 3.5));
        list.tambah(new Mahasiswa("102", "Budi", "1B", 3.7));
        list.tambah(new Mahasiswa("103", "Citra", "1C", 3.8));
        list.tambah(new Mahasiswa("104", "Dina", "1D", 3.2));
        list.tambah(new Mahasiswa("105", "Eka", "1E", 3.9));

        // tampil semua data
        System.out.println("Data Mahasiswa:");
        list.tampil();

        // ================== SEQUENTIAL SEARCH ==================
        System.out.print("Masukkan IPK yang dicari (Sequential): ");
        double cari = sc.nextDouble();

        int pos = list.sequentialSearch(cari);

        list.tampilPosisi(cari, pos);
        list.tampilDataSearch(cari, pos);

        // ================== BINARY SEARCH ==================
        System.out.print("\nMasukkan IPK yang dicari (Binary): ");
        double cari2 = sc.nextDouble();

        int pos2 = list.findBinarySearch(cari2, 0, list.listMhs.length - 1);

        list.tampilPosisi(cari2, pos2);
        list.tampilDataSearch(cari2, pos2);
        sc.close();
    }
}