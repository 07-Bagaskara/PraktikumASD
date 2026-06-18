package Jobsheet11;

public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();

        Mahasiswa00 mhs1 = new Mahasiswa00("21212203", "Dirga", "1C", 3.6);
        Mahasiswa00 mhs2 = new Mahasiswa00("22212202", "Cintia", "1C", 3.5);
        Mahasiswa00 mhs3 = new Mahasiswa00("23212201", "Bimon", "1C", 3.8);
        Mahasiswa00 mhs4 = new Mahasiswa00("24212200", "Alvaro", "1C", 4.0);

        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        
        sll.addLast(mhs4);
        sll.print();
        
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        
        sll.removeAt(0);
        sll.print();
    }
}