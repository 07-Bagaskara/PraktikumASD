package Jobsheet4;

public class Faktorial {

    // method brute force (iteratif / loop)
    public int faktorialBF(int n) {
        int fakto = 1; // variabel penampung hasil
        for (int i = 1; i <= n; i++) { // perulangan dari 1 sampai n
            fakto *= i; // perkalian bertahap
        }
        return fakto; // mengembalikan hasil
    }

    // method divide conquer (rekursif)
    public int faktorialDC(int n) {
        if (n == 1) { // base case (berhenti)
            return 1;
        } else { // proses rekursif
            return n * faktorialDC(n - 1);
        }
    }
}