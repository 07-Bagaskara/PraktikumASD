package Jobsheet9;

import java.util.Scanner;

public class SuratDemo_1C {
    public static void main(String[] args) {
        StackSurat_1C stackSurat = new StackSurat_1C(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu Layanan Surat Izin Prodi:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (berdasarkan Nama)");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S: Sakit / I: Izin lain): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    
                    Surat_1C suratBaru = new Surat_1C(id, nama, kelas, jenis, durasi);
                    stackSurat.push(suratBaru);
                    System.out.println("Surat dari " + nama + " berhasil diterima ke tumpukan.");
                    break;
                    
                case 2:
                    Surat_1C diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat ID " + diproses.idSurat + " atas nama " + diproses.namaMahasiswa);
                    }
                    break;
                    
                case 3:
                    Surat_1C terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir di tumpukan adalah milik: " + terakhir.namaMahasiswa + " (Kelas: " + terakhir.kelas + ")");
                    }
                    break;
                    
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String keyword = scan.nextLine();
                    stackSurat.cariSurat(keyword);
                    break;
                    
                default:
                    if (pilih < 1 || pilih > 4) System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}