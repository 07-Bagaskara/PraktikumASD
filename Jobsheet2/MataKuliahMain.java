package Jobsheet2;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "AR60";
        mk1. nama = "Ayas";
        mk1. sks = 5 ;
        mk1. jumlahJam = 1 ;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);

        MataKuliah mk2 = new MataKuliah("AR80","Saya",7,1);
        mk2.tampilkanInformasi();
        mk2.ubahSKS(5);
    }
}
