package Jobsheet1;

public class Fungsi {

    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] harga = {75000, 50000, 60000, 10000};

    static void hitungPendapatan() {
        for (int i = 0; i < stock.length; i++) {
            int total = 0;
            for (int j = 0; j < stock[i].length; j++) {
                total += stock[i][j] * harga[j];
            }

            System.out.println("RoyalGarden " + (i+1) +
                    " Pendapatan = Rp" + total);

            if (total > 1500000)
                System.out.println("Status: Sangat Baik");
            else
                System.out.println("Status: Perlu Evaluasi");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hitungPendapatan();
    }
}
