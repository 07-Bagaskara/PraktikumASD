package Jobsheet2;

public class MataKuliah {
    public MataKuliah(){
    }
    public MataKuliah(String kodeMK, String nama,int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    String kodeMK; 
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("KodeMK: "+kodeMK);
        System.out.println("Nama: "+nama);
        System.out.println("SKS: "+sks);
        System.out.println("JumlahJam: "+jumlahJam);
    }
    void ubahSKS(int sksBaru) {
            sks = sksBaru;
        }
    void tambahJam(int jam){
        jumlahJam+=jam;
    }


    void kurangiJam(int jam){
        jumlahJam=jam;
        if(jumlahJam >=jam) {
            jumlahJam -=jam;
        }else{
            System.out.println("Pengurangan tidak dapat dilakukan");
        }
    }
}
