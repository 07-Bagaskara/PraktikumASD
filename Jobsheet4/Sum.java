package Jobsheet4;

public class Sum {

    int[] arr; // array data

    // constructor
    Sum(int[] arr) {
        this.arr = arr;
    }

    // method brute force (loop)
    int totalBF() {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i]; // penjumlahan
        }
        return total;
    }

    // method divide conquer (rekursif)
    int totalDC(int l, int r) {
        if (l == r) { // base case
            return arr[l];
        }

        int mid = (l + r) / 2; // membagi array

        int lsum = totalDC(l, mid); // bagian kiri
        int rsum = totalDC(mid + 1, r); // bagian kanan

        return lsum + rsum; // combine
    }
}