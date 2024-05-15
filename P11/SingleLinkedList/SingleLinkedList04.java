public class SingleLinkedList04 {
    Node04 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node04 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node04 ndInput = new Node04(input, null);
        Node04 temp = head;
        do{
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }

    void insertAt(int index, int input) {
        Node04 ndInput = new Node04(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya! Kalau indeksnya -1 bagaimana?");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node04 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
                if (temp == null) {
                    System.out.println("Indeks tidak valid!");
                    return;
                }
            
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }

    int getData(int index) {
        Node04 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    int indexOf(int key) {
        Node04 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        }else{
            Node04 temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return;
        }else{
            Node04 temp = head;
        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }
            temp = temp.next;
        }
    }
}

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }else{
        Node04 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        } else {
            System.out.println("Indeks tidak valid!");
        }
        }
        
    }
}
    
