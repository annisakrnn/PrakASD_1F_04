public class TransaksiPesanan04 {
        Pesanan04 head;
        int size;
    
        public TransaksiPesanan04(){
            head = null;
            size = 0;
        }
        public boolean IsEmpty(){
            return head == null;
        }
        public void addLast(int kodePesanan, String namaPesanan, int harga){
            if (IsEmpty()){
                head  = new Pesanan04(null, kodePesanan, namaPesanan, harga, null);
            }else{
                Pesanan04 current = head;
                while (current.next != null){
                    current = current.next;
                }
                Pesanan04 newNode = new Pesanan04(current, kodePesanan, namaPesanan, harga, null);
                current.next = newNode;
                size++;
            }
        }
        public void print(){
            System.out.println("----------------------");
            System.out.println("Data Saat Ini Menjadi"); 
            if(!IsEmpty()){
                Pesanan04 tmp = head;
                while (tmp != null){
                    System.out.println("Kode Pesanan \t\t: "+tmp.kodePesanan);
                    System.out.println("Judul Film \t: "+tmp.namaPesanan);
                    System.out.println("Harga \t\t: "+tmp.harga);
                    System.out.println();
                    tmp = tmp.next;
                }
            }else{
                System.out.println("Linked List Kosong");
            }
        }
        public void sort(){
            Pesanan04 current = null, index = null;
            int tempkp;
            String tempnp;
            int temphg;
            if (head == null) {
                return;
            } else {
                for (current = head; current.next != null; current = current.next) {
                    for (index = current.next; index != null; index = index.next) {
                        if (current.harga < index.harga) {
                            temphg = current.harga;
                            current.harga = index.harga;
                            index.harga = temphg;
                            tempkp = current.kodePesanan;
                            current.kodePesanan = index.kodePesanan;
                            index.kodePesanan = tempkp;
                            tempnp = current.namaPesanan;
                            current.namaPesanan = index.namaPesanan;
                            index.namaPesanan = tempnp;
                        }
                    }
                }
                print();
            }
        }
}

