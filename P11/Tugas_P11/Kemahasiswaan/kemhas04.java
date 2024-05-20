public class kemhas04 {

    kemahasiswaan04 head, tail;
    boolean isEmpty() {
        return head == null;
    }
    void print() {
        if (!isEmpty()) {
            kemahasiswaan04 temp = head;
            System.out.println("Isi Linked List:");
            while (temp != null) {
                System.out.println("Nama: " + temp.nama 
                                + ", NIM: " + temp.nim + "\t");
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    void addFirst(String nama, int nim) {
        kemahasiswaan04 newNode = new kemahasiswaan04(nama, nim);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    void addLast(String nama, int nim) {
        kemahasiswaan04 newNode = new kemahasiswaan04(nama, nim);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    void insertAfter(String key, String nama, int nim) {
        kemahasiswaan04 newNode = new kemahasiswaan04(nama, nim);
        kemahasiswaan04 temp = head;
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
            System.out.println("Indeks tidak valid! Indeks harus >= 0.");
        } else if (index == 0) {
            addFirst(nama, nim);
        } else {
            kemahasiswaan04 newNode = new kemahasiswaan04(nama, nim);
            kemahasiswaan04 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Indeks tidak valid!");
                    return;
                }
            }
            if (temp == null || (temp.next == null && index > 1)) {
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
    String getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return null;
        }
        kemahasiswaan04 temp = head;
        for (int i = 0; i < index; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                System.out.println("Indeks tidak valid!");
                return null;
            }
        }
        if (temp != null) {
            return temp.nama;
        } else {
            System.out.println("Indeks tidak valid!");
            return null;
        }
    }
    kemahasiswaan04 removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return null;
        } else if (head == tail) {
            kemahasiswaan04 temp = head;
            head = tail = null;
            return temp;
        } else {
            kemahasiswaan04 temp = head;
            head = head.next;
            return temp;
        }
    }
}