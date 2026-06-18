package Jobsheet11;

import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Misalkan kapasitas maksimal antrian dalam satu hari adalah 20 orang
        QueueLinkedList queue = new QueueLinkedList(20); 

        int menu;
        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian Mahasiswa (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Cek Antrian Terdepan & Terbelakang");
            System.out.println("4. Tampilkan Seluruh Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = sc.nextLine();
                    MahasiswaTugas mhs = new MahasiswaTugas(nim, nama, keperluan);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFrontRear();
                    break;
                case 4:
                    queue.printSemuaAntrian();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program layanan.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 0);
        
        sc.close();
    }
}