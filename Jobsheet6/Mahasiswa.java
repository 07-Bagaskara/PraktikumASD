package Jobsheet6;

// Class Mahasiswa -> untuk menyimpan data mahasiswa
public class Mahasiswa {
    String nim;     // atribut NIM
    String nama;    // atribut nama
    String kelas;   // atribut kelas
    double ipk;     // atribut IPK

    // Konstruktor default
    Mahasiswa() {
    }

    // Konstruktor berparameter
    Mahasiswa(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    // Method untuk menampilkan informasi mahasiswa
    void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("---------------------------");
    }
}