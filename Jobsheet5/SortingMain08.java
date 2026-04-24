package Jobsheet5;

public class SortingMain08 {

    public static void main(String[] args) { // method main

        int[] a = {5, 3, 8, 4, 2}; // array data

        Sorting08 data1 = new Sorting08(a, a.length); // objek

        System.out.println("Data sebelum sorting:");
        data1.tampil();

        data1.bubbleSort(); // panggil bubble sort

        System.out.println("Setelah Bubble Sort:");
        data1.tampil();

        // Selection Sort
        int[] b = {9, 1, 6, 7, 3};
        Sorting08 data2 = new Sorting08(b, b.length);

        data2.selectionSort();
        System.out.println("Selection Sort:");
        data2.tampil();

        // Insertion Sort
        int[] c = {10, 4, 2, 8, 6};
        Sorting08 data3 = new Sorting08(c, c.length);

        data3.insertionSort();
        System.out.println("Insertion Sort:");
        data3.tampil();
    }
}