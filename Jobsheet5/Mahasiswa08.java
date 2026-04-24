package Jobsheet5;

public class Mahasiswa08 {

    String nim, nama, kelas; // atribut
    double ipk;

    // konstruktor
    public Mahasiswa08(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // method tampil
    void tampilInformasi() {
        System.out.println(nim + " | " + nama + " | " + kelas + " | " + ipk);
    }
}