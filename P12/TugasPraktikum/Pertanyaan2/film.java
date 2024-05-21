public class film {
    Film04 head;
    int size;

    public film(){
        head = null;
        size = 0;
    }
    public boolean IsEmpty(){
        return head == null;
    }
    public void addFirst(int id, String judulFilm, double rating){
        if (IsEmpty()){
            head  = new Film04(null, id, judulFilm, rating, null);
        }else{
            Film04 newNode = new Film04(null, id, judulFilm, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int id, String judulFilm, double rating){
        if (IsEmpty()){
            addFirst(id, judulFilm, rating);
        }else{
            Film04 current = head;
            while (current.next != null){
                current = current.next;
            }
            Film04 newNode = new Film04(current, id, judulFilm, rating, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int id, String judulFilm, double rating, int index) throws Exception {
        if (IsEmpty()){
            addFirst(id, judulFilm, rating);
        }else if (index <0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Film04 current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Film04 newNode = new Film04(null, id, judulFilm, rating, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Film04 newNode = new Film04(current.prev, id, judulFilm, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public void removeFirst() throws Exception{
        if(IsEmpty()){
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if(IsEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Film04 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (IsEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            Film04 current = head;
            int i=0;
            while (i<index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void print(){
        System.out.println("----------------------");
        System.out.println("Data Saat Ini Menjadi"); 
        if(!IsEmpty()){
            Film04 tmp = head;
            while (tmp != null){
                System.out.println("ID \t\t: "+tmp.id);
                System.out.println("Judul Film \t: "+tmp.judulFilm);
                System.out.println("Rating \t\t: "+tmp.rating);
                System.out.println();
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public int findSeqSearch(int cari){
        Film04 tmp = head;
        int posisi = -1;
        int index = 0;
        while (tmp != null){
            if(tmp.id == cari){
                posisi = index;
                break;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if(pos != -1 && pos < size){
            Film04 tmp = head;
            for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
            }
            System.out.println("ID\t\t: "+ x +" berada di node "+pos);
            System.out.println("IDENTITAS:");
            System.out.println("ID Film: " + tmp.id);
            System.out.println("Judul Film: " + tmp.judulFilm);
            System.out.println("IMDB Rating: " + tmp.rating);
        }else {
            System.out.println("ID\t\t"+ x +" tidak ditemukan");
        }
    }
    public void sort(){
        Film04 current = null, index = null;
        int tempID;
        String tempJD;
        Double tempRT;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.rating < index.rating) {
                        tempRT = current.rating;
                        current.rating = index.rating;
                        index.rating = tempRT;
                        tempID = current.id;
                        current.id = index.id;
                        index.id = tempID;
                        tempJD = current.judulFilm;
                        current.judulFilm = index.judulFilm;
                        index.judulFilm = tempJD;
                    }
                }
            }
            print();
        }
    }
}

