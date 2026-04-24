package Jobsheet5;

public class MahasiswaDemo08 {

    public static void main(String[] args) { // main

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();

        // tambah data
        list.tambah(new Mahasiswa08("01", "A", "TI", 3.2));
        list.tambah(new Mahasiswa08("02", "B", "TI", 3.8));
        list.tambah(new Mahasiswa08("03", "C", "TI", 3.5));
        list.tambah(new Mahasiswa08("04", "D", "TI", 3.9));
        list.tambah(new Mahasiswa08("05", "E", "TI", 3.1));

        System.out.println("Data awal:");
        list.tampil();

        list.bubbleSort(); // sorting

        System.out.println("Setelah Bubble Sort:");
        list.tampil();

        list.selectionSort();
        System.out.println("Selection Sort:");
        list.tampil();

        list.insertionSort();
        System.out.println("Insertion Sort:");
        list.tampil();
    }
}