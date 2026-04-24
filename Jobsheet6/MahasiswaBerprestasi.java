package Jobsheet6;

// Class untuk mengelola array mahasiswa
public class MahasiswaBerprestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5]; // array mahasiswa
    int idx; // index penanda jumlah data

    // Method untuk menambah data ke array
    void tambah(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Method untuk menampilkan semua data
    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampilInformasi();
        }
    }

    // ================== SEQUENTIAL SEARCH ==================

    // Method sequential search (mencari IPK)
    int sequentialSearch(double cari) {
        int posisi = -1; // default tidak ditemukan

        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break; // menghentikan loop saat data ditemukan
            }
        }
        return posisi;
    }

    // Method menampilkan posisi
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data IPK " + x + " ditemukan pada index ke-" + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    // Method menampilkan data hasil pencarian
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + ":");
            listMhs[pos].tampilInformasi();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    // ================== BINARY SEARCH ==================

    // Method binary search
    int findBinarySearch(double cari, int left, int right) {
        int mid;

        if (right >= left) {
            mid = (left + right) / 2; // proses divide

            if (cari == listMhs[mid].ipk) {
                return mid; // data ditemukan
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1); // cari kiri
            } else {
                return findBinarySearch(cari, mid + 1, right); // cari kanan
            }
        }

        return -1; // tidak ditemukan
    }
}