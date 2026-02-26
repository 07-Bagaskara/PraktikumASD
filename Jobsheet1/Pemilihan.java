package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas;

        System.out.print("Nilai Tugas   : ");
        tugas = sc.nextDouble();
        System.out.print("Nilai Kuis    : ");
        kuis = sc.nextDouble();
        System.out.print("Nilai UTS     : ");
        uts = sc.nextDouble();
        System.out.print("Nilai UAS     : ");
        uas = sc.nextDouble();

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {

            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis)
                              + (0.3 * uts) + (0.3 * uas);

            String nilaiHuruf;
            String keterangan;

            if (nilaiAkhir >= 80) nilaiHuruf = "A";
            else if (nilaiAkhir >= 75) nilaiHuruf = "B+";
            else if (nilaiAkhir >= 70) nilaiHuruf = "B";
            else if (nilaiAkhir >= 65) nilaiHuruf = "C+";
            else if (nilaiAkhir >= 60) nilaiHuruf = "C";
            else if (nilaiAkhir >= 50) nilaiHuruf = "D";
            else nilaiHuruf = "E";

            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+")
                || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")
                || nilaiHuruf.equals("C")) {
                keterangan = "LULUS";
            } else {
                keterangan = "TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("Keterangan  : " + keterangan);
            
        }
        sc.close();
    }
}