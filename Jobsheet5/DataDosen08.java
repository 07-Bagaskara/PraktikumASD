package Jobsheet5;

public class DataDosen08 {

    Dosen08[] dataDosen = new Dosen08[10]; // array
    int idx;

    // tambah data
    void tambah(Dosen08 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        }
    }

    // tampil data
    void tampil() {
        for (Dosen08 d : dataDosen) {
            if (d != null)
                d.tampil();
        }
    }

    // bubble sort ASC (termuda)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen08 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    // selection sort DSC (tertua)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen08 temp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}