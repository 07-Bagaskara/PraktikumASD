package Jobsheet2;

public class Mahasiswa {
    
    String nama;
    String nim;
    String kelas;
    Double ipk;

    void tampilkanInformasi(){
    System.out.println("Nama: "+nama);
    System.out.println("NIM: "+nim);
    System.out.println("IPK: "+ipk);
    System.out.println("Kelas: "+kelas);
}
void ubahKelas(String kelasBaru) {
    kelas=kelasBaru;
}
//Hasil Modifikasi
void updateIpk(Double ipkBaru) {
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
    }else {
        System.out.println("IPK tidak valid.Harus antara0.0 dan 4.0");
    }
}

void nilaiKinerja() {
    if (ipk >=3.5) {
        return "Kinerja sangat baik";
    }else if (ipk >=3.0) {
        return "Kinerja baik";
    }else if (ipk >=2.0) {
        return "Kinerja cukup";
    }else {
        return "Kinerja kurang";
    }
}
}