package Jobsheet2;

public class DosenMain {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen();
        dsn1.idDosen = "12345678";
        dsn1.nama ="Bayu";
        dsn1.statusAktif=true;
        dsn1.tahunBergabung=2020;
        dsn1.bidangKeahlian="Coding";

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2026);
        dsn1.ubahKeahlian(null);

        Dosen dsn2 = new Dosen("87654321","Rizal",true,2022,"Cyber Security");
         dsn2.tampilkanInformasi();
         dsn2.hitungMasaKerja(2026);
    }
}
