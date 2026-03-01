package Jobsheet3;
import java.util.Scanner;
public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa08[] arrayOfMahasiswa08 = new Mahasiswa08[3];
        String dummy;

        for (int i=0;i <3;i++){
        arrayOfMahasiswa08[i] = new Mahasiswa08();
        
        System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
        System.out.print("NIM: ");
        arrayOfMahasiswa08[i].nim = sc.nextLine();
        System.out.print("Nama: ");
        arrayOfMahasiswa08[i].nama = sc.nextLine();
        System.out.print("Kelas: ");
        arrayOfMahasiswa08[i].kelas = sc.nextLine();
        System.out.print("IPK: ");
        dummy = sc.nextLine();
        arrayOfMahasiswa08[i].ipk = Float.parseFloat(dummy);
        System.out.println("-------------------------------------");
        }
        for(int i=0; i <3;i++){
        System.out.println("Data Mahasiswa ke-"+(i+1));
        System.out.println("NIM: "+arrayOfMahasiswa08[i].nim);
        System.out.println("Nama: "+arrayOfMahasiswa08[i].nama);
        System.out.println("Kelas: "+arrayOfMahasiswa08[i].kelas);
        System.out.println("IPK: "+arrayOfMahasiswa08[i].ipk);
        System.out.println("-------------------------------------");
        }
        sc.close();
    }
}
