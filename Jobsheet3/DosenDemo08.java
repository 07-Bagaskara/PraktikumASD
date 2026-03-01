package Jobsheet3;
import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen08[] arrayOfDosen = new Dosen08[jumlah];


        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (P/L) : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("L");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        DataDosen08 data = new DataDosen08();

        System.out.println("\n===== DATA SEMUA DOSEN =====");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== RERATA USIA PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING TUA =====");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING MUDA =====");
        data.infoDosenPalingMuda(arrayOfDosen);
        sc.close();
    }
}