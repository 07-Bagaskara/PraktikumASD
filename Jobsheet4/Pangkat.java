package Jobsheet4;

public class Pangkat {

    int nilai;   // atribut nilai
    int pangkat; // atribut pangkat

    // constructor (inisialisasi objek)
    Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // method brute force (loop)
    int pangkatBF() {
        int hasil = 1; // penampung hasil
        for (int i = 0; i < pangkat; i++) { // perulangan
            hasil *= nilai; // perkalian
        }
        return hasil;
    }

    // method divide conquer (rekursif)
    int pangkatDC(int n, int p) {
        if (p == 0) { // base case
            return 1;
        } else {
            return n * pangkatDC(n, p - 1); // rekursif
        }
    }
}