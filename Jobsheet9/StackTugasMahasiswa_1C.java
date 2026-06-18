package Jobsheet9;

public class StackTugasMahasiswa_1C {
    Mahasiswa_1C[] stack;
    int size;
    int top;

    public StackTugasMahasiswa_1C(int size) {
        this.size = size;
        stack = new Mahasiswa_1C[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa_1C mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa_1C pop() {
        if (!isEmpty()) {
            Mahasiswa_1C m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa_1C peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Perbaikan: Loop dibalik agar menampilkan tugas teratas terlebih dahulu (LIFO)
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Tambahan method dari Percobaan 2
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi_1C stackKonversi = new StackKonversi_1C();
        if (nilai == 0) return "0";
        
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonversi.push(sisa);
            nilai = nilai / 2;
        }
        
        String biner = new String();
        while (!stackKonversi.isEmpty()) {
            biner += stackKonversi.pop();
        }
        return biner;
    }

    // Tambahan method untuk Pertanyaan 4: Melihat tugas pertama (terbawah)
    public Mahasiswa_1C lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // Tambahan method untuk Pertanyaan 5: Menghitung jumlah tugas
    public int getJumlahTugas() {
        return top + 1;
    }
}