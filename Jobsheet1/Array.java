package Jobsheet1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mata Kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        String[] nilaiHuruf = new String[n];

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-" + (i+1));
            System.out.print("Nama MK : ");
            namaMK[i] = sc.nextLine();

            System.out.print("SKS     : ");
            sks[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Nilai Huruf : ");
            nilaiHuruf[i] = sc.nextLine();

            double nilaiSetara = 0;

            switch (nilaiHuruf[i]) {
                case "A": nilaiSetara = 4; break;
                case "B+": nilaiSetara = 3.5; break;
                case "B": nilaiSetara = 3; break;
                case "C+": nilaiSetara = 2.5; break;
                case "C": nilaiSetara = 2; break;
                case "D": nilaiSetara = 1; break;
                case "E": nilaiSetara = 0; break;
            }

            totalNilai += nilaiSetara * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalNilai / totalSKS;
        System.out.println("IP Semester = " + ip);
        sc.close();
    }
}