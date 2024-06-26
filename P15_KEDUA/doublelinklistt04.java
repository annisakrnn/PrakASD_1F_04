import org.w3c.dom.Node;

public class doublelinklistt04 {

        public nodee04 head;
        public int size;
    
        public doublelinklistt04(){
            head = null;
            size = 0;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public int size(){
            return size;
        }
        public void clear(){
            head = null;
            size = 0;
        }
        public int get(int index) throws Exception{
            if(isEmpty() || index >= size){
                throw new Exception ("nilai indeks diluar batas");
            }
            nodee04 tmp = head;
            for (int i =0; i<index; i++){
                tmp = tmp.next;
            }
            return tmp.data;
        }
        public void addFirst(int item, int jarak){
            if (isEmpty()) {
            head = new nodee04(null, item, jarak, null);
        }else{
            nodee04 newNode = new nodee04(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
        }
        public int getJarak(int index) throws Exception{
            if (isEmpty() || index >= size) {
                throw new Exception("Nilai indeks diluar batas");
            }
            nodee04 tmp = head;
            for(int i = 0   ; i < index; i++){
                tmp = tmp.next;
            }
            return tmp.jarak;
        }
         public void setJarak(int index, int jarak) throws Exception {
        if (index >= size || index < 0) {
            throw new Exception("Index out of bounds");
        }
        nodee04 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.jarak = jarak;
    }
        public void remove(int index){
            nodee04 current = head;
            while (current != null) {
                if (current.data == index) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }else{
                        head=current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    size--;
                    return;
                }
                current = current.next;
            }
            
        }
    }

