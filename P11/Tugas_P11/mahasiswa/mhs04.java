public class mhs04 {
    mahasiswa04 head, tail;
    boolean isEmpty() {
        return head == null;
    }
    void print() {
        if (!isEmpty()) {
            mahasiswa04 temp = head;
            System.out.println("Isi Linked List:");
            while (temp != null) {
                System.out.println("Nama: " + temp.nama 
                                +  ", NIM: " + temp.nim + "\t");
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    void addFirst(String nama, int nim) {
        mahasiswa04 newNode = new mahasiswa04(nama, nim);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    void addLast(String nama, int nim) {
        mahasiswa04 newNode = new mahasiswa04(nama, nim);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    void insertAfter(String key, String nama, int nim) {
        mahasiswa04 newNode = new mahasiswa04(nama, nim);
        mahasiswa04 temp = head;
        while (temp != null) {
            if (temp.nama.equals(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }
    void insertAt(int index, String nama, int nim) {
        if (index < 0) {
            System.out.println("Perbaiki logikanya! Kalau indeksnya -1 bagaimana?");
        } else if (index == 0) {
            addFirst(nama, nim);
        } else {
            mahasiswa04 newNode = new mahasiswa04(nama, nim);
            mahasiswa04 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Indeks tidak valid!");
                    return;
                }
            }
            if (temp == null) {
                System.out.println("Indeks tidak valid!");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }
}