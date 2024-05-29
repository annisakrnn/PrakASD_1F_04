public class Transaksi04 {
        Pembeli04 head;
        int size;
        public Transaksi04(){
            head = null;
            size = 0;
        }
        public boolean IsEmpty(){
            return head == null;
        }
        public void addLast(String nama, String noHp){
            if (IsEmpty()){
                head  = new Pembeli04(null, nama, noHp, null);
            }else{
                Pembeli04 current = head;
                while (current.next != null){
                    current = current.next;
                }
                Pembeli04 newNode = new Pembeli04(current, nama, noHp,null);
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
                System.out.println(head.nama+"Sudah dibayar");
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        public void removeLast() throws Exception {
            if(IsEmpty()){
                throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
            }else if (head.next == null){
                System.out.println(head.nama+"Sudah Dibayar");
                head = null;
                size--;
                return;
            }
            Pembeli04 current = head;
            while (current.next.next != null){
                current = current.next;
            }
            current.next = null;
            size--;
        }
        public void print(){
            System.out.println("+++++++++++++++++++++++++");
            System.out.println(" RESTO ROYAL DELISH ");
            System.out.println("+++++++++++++++++++++++++"); 
            System.out.println("| Nama\t| No.Hp"+"\t|");
            if(!IsEmpty()){
                Pembeli04 tmp = head;
                while (tmp != null){
                    System.out.print("| "+tmp.nama+"\t| "+tmp.noHp+" "+"\t|\n");
                    tmp = tmp.next;
                }
                System.out.println("\nTotal Antrian "+size);
            }else{
                System.out.println("Linked List Kosong");
        
            }
            size++;
        }
    }