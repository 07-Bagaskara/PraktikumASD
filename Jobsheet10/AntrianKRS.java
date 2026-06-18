package Jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int dpaMaxTarget = 30;
    int jumlahTerproses = 0;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        size = 0;
        front = 0;
        rear = -1;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, harap tunggu!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian persetujuan KRS.");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada KRS yang diproses.");
            return;
        }
        
        System.out.println("--- Memproses Persetujuan KRS ---");
        // Memproses hingga 2 mahasiswa sekaligus
        int limit = Math.min(2, size);
        for (int i = 0; i < limit; i++) {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            jumlahTerproses++;
            System.out.print("- Berhasil disetujui: ");
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void peekTwo() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return;
        }
        System.out.println("Dua Mahasiswa Terdepan:");
        int limit = Math.min(2, size);
        for (int i = 0; i < limit; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.print("Antrian Paling Akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void printStatus() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
        System.out.println("Jumlah KRS yang sudah diproses: " + jumlahTerproses);
        int belum = Math.max(0, dpaMaxTarget - jumlahTerproses);
        System.out.println("Sisa mahasiswa yang belum melakukan proses KRS (Target DPA): " + belum);
    }
}