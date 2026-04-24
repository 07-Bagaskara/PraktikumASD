package Jobsheet5;

public class Sorting08 {

    int[] data; // atribut array untuk menyimpan data
    int jmlData; // jumlah data

    // constructor (konstruktor)
    public Sorting08(int[] data, int jmlData) {
        this.data = data;
        this.jmlData = jmlData;
    }

    // method bubble sort
    void bubbleSort() {
        for (int i = 0; i < jmlData - 1; i++) { // perulangan tahap
            for (int j = 0; j < jmlData - i - 1; j++) { // perbandingan
                if (data[j] > data[j + 1]) { // jika kiri lebih besar
                    int temp = data[j]; // tukar
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // method selection sort
    void selectionSort() {
        for (int i = 0; i < jmlData - 1; i++) { // tahap
            int minIndex = i; // anggap paling kecil

            for (int j = i + 1; j < jmlData; j++) { // cari nilai minimum
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            // tukar posisi
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    // method insertion sort
    void insertionSort() {
        for (int i = 1; i < jmlData; i++) { // mulai dari index 1
            int key = data[i]; // simpan nilai
            int j = i - 1;

            // geser data yang lebih besar
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key; // letakkan key
        }
    }

    // method tampil
    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}