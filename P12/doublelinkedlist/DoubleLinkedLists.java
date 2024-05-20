public class DoubleLinkedLists {
    node04 head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    public boolean IsEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        if (IsEmpty()){
            head = new node04(null, item, null);
        }else{
            node04 newNode = new node04(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item){
        if (IsEmpty()){
            addFirst(item);
        }else{
            node04 current = head;
            while (current.next != null) {
                current = current.next;
            }
            node04 newNode = new node04(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception{
        if (IsEmpty()) {
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        }else{
            node04 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node04 newNode = new node04(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else{
                node04 newNode = new node04(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (!IsEmpty()) {
            node04 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked Lists kosong");
        }
    }
}

