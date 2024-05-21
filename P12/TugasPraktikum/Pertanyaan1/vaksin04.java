public class vaksin04 {
    vaksinasi04 head;
    int size;

    public vaksin04(){
        head = null;
        size = 1; 
    }

    public boolean IsEmpty(){
        return head == null;
    }

    public void addLast(int nomor, String nama){
        if (IsEmpty()){
            head  = new vaksinasi04(null, nomor, nama, null);
        }else{
            vaksinasi04 current = head;
            while (current.next != null){
                current = current.next;
            }
            vaksinasi04 newNode = new vaksinasi04(current, nomor, nama,null);
            current.next = newNode;
            size++;
        }
    }
    public void removeFirst() throws Exception{
        if(IsEmpty()){
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            System.out.println(head.nama+"Sudah Divaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if(IsEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
            System.out.println(head.nama+"Sudah Divaksin");
            head = null;
            size--;
            return;
        }
        vaksinasi04 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void print(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" DAFTAR PENGANTRI VAKSIN ");
        System.out.println("+++++++++++++++++++++++++"); 
        System.out.println("| No\t| Nama\t|");
        if(!IsEmpty()){
            vaksinasi04 tmp = head;
            while (tmp != null){
                System.out.print("| "+tmp.nomor+"\t| "+tmp.nama+" "+"\t|");
                tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian "+size);
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}