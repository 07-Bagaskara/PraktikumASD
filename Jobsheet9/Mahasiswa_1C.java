package Jobsheet9;

public class Mahasiswa_1C {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa_1C(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // Nilai default ketika tugas belum dinilai
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}