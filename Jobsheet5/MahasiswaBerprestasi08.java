package Jobsheet5;

public class MahasiswaBerprestasi08 {

    Mahasiswa08[] listMhs = new Mahasiswa08[5]; // array object
    int idx; // index

    // method tambah
    void tambah(Mahasiswa08 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }
    }

    // method tampil
    void tampil() {
        for (Mahasiswa08 m : listMhs) {
            m.tampilInformasi();
        }
    }

    // bubble sort (descending IPK)
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa08 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    // selection sort (ascending)
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[min].ipk) {
                    min = j;
                }
            }
            Mahasiswa08 temp = listMhs[min];
            listMhs[min] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    // insertion sort
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa08 temp = listMhs[i];
            int j = i - 1;

            while (j >= 0 && listMhs[j].ipk > temp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }

            listMhs[j + 1] = temp;
        }
    }
}