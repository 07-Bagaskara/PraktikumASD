package Jobsheet11;

public class Mahasiswa00 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa00() {
    }

    public Mahasiswa00(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(ipk);
    }
}