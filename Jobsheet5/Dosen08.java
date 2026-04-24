package Jobsheet5;

public class Dosen08 {

    String kode, nama;
    boolean jenisKelamin;
    int usia;

    // konstruktor
    public Dosen08(String kd, String nama, boolean jk, int usia) {
        this.kode = kd;
        this.nama = nama;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    // tampil
    void tampil() {
        System.out.println(kode + " | " + nama + " | " + usia);
    }
}