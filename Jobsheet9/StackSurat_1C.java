package Jobsheet9;

public class StackSurat_1C {
    Surat_1C[] stack;
    int size;
    int top;

    public StackSurat_1C(int size) {
        this.size = size;
        stack = new Surat_1C[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat_1C surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Tumpukan surat penuh!");
        }
    }

    public Surat_1C pop() {
        if (!isEmpty()) {
            Surat_1C diproses = stack[top];
            top--;
            return diproses;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat_1C peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tumpukan surat kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat\t: " + stack[i].idSurat);
                System.out.println("Nama\t\t: " + stack[i].namaMahasiswa);
                System.out.println("Jenis Izin\t: " + (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's' ? "Sakit" : "Izin Lainnya"));
                System.out.println("Durasi\t\t: " + stack[i].durasi + " hari");
                ditemukan = true;
                break; // Hentikan pencarian jika menemukan surat terbaru dari nama tersebut
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan di tumpukan.");
        }
    }
}