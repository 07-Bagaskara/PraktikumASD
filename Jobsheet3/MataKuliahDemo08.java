package Jobsheet3;
import java.util.Scanner;


public class MataKuliahDemo08 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String kode,nama,dummy;
    int sks,jumlahJam;

    System.out.print("Masukkan jumlah matakuliah yang ingin diinput: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        MataKuliah08[] arrayOfMataKuliah = new MataKuliah08[jumlahMatkul];

    for (int i=0;i <jumlahMatkul ; i++){
        System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
        System.out.print("Kode: ");
        kode = sc.nextLine();
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("Sks: ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam: ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("-------------------------------------");

        arrayOfMataKuliah[i]= new MataKuliah08(kode,nama,sks,jumlahJam);

    }
    for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    sc.close();
    }
}
