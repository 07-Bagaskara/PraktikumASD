package Jobsheet12;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa data) {
        Node current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node newNode = new Node(data);
        if (current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { 
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // Modifikasi Pertanyaan Percobaan 2 (No. 2): Menampilkan data yang dihapus
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil(); 

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Modifikasi Pertanyaan Percobaan 2 (No. 2): Menampilkan data yang dihapus
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil(); 

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Menjawab Pertanyaan Percobaan 1 (No. 5): Menampilkan pesan kosong jika tidak ada data
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------------");
            current = current.next;
        }
    }

    // Menjawab Pertanyaan Percobaan 1 (No. 6): Method printReverse()
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node current = tail; // Mulai dari belakang
        System.out.println("Mencetak data dari belakang:");
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------------");
            current = current.prev; // Mundur menggunakan prev
        }
    }
}