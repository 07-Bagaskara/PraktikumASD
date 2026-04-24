package Jobsheet4;

import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) { // method utama
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int n = sc.nextInt();

        int[] data = new int[n]; // array

        // input data
        for (int i = 0; i < n; i++) {
            System.out.print("Keuntungan bulan ke-" + (i+1) + ": ");
            data[i] = sc.nextInt();
        }

        Sum s = new Sum(data); // objek

        // output
        System.out.println("Total BF: " + s.totalBF());
        System.out.println("Total DC: " + s.totalDC(0, n-1));
        
        sc.close();
    }
}
