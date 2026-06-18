package Jobsheet11;

public class QueueLinkedList {
    NodeAntrian front, rear;
    int size;
    int maxCapacity;

    public QueueLinkedList(int maxCapacity) {
        front = rear = null;
        size = 0;
        this.maxCapacity = maxCapacity;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == maxCapacity;
    }

    public void enqueue(MahasiswaTugas data) {
        if (isFull()) {
            System.out.println("Mohon maaf, antrian sudah penuh!");
            return;
        }
        NodeAntrian newNode = new NodeAntrian(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("Memanggil antrian atas nama: " + front.data.nama);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void printFrontRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- Antrian Terdepan ---");
            front.data.tampilData();
            System.out.println("--- Antrian Paling Akhir ---");
            rear.data.tampilData();
        }
    }

    public void printSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        NodeAntrian temp = front;
        System.out.println("=== Daftar Antrian ===");
        int i = 1;
        while (temp != null) {
            System.out.print("Antrian " + i + ": ");
            temp.data.tampilData();
            temp = temp.next;
            i++;
        }
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}