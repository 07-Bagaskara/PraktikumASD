package Jobsheet10;

import java.util.Scanner;

public class SistemKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Antrian maksimal 10 sesuai aturan tugas
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Antrian KRS Mahasiswa");
            System.out.println("2. Proses KRS (2 Mahasiswa Sekaligus)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Status Antrian & Target DPA");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.peekTwo();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    antrian.printStatus();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Sistem ditutup.");
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}