public class WarungQueue04 {
    Warung04[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public WarungQueue04(int n){
        max = n;
        antrian = new Warung04[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        return size == 0;
    }

    public boolean IsFull(){
        return size == max;
    }
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("Elemen terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(Warung04 wg){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = wg;
            size++;
        }
    }

    public Warung04 dequeue(){
        Warung04 wg = null;
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            wg = antrian[front];
            size--;

            if (IsEmpty()){
                front = rear = -1;
            } else {
                if (front == max - 1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return wg;
    }
}
