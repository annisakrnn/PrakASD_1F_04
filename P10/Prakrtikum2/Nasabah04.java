public class Nasabah04 {
    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;
    
    Nasabah04(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
    
    Nasabah04[] data;
    int front;
    int rear;
    int size;
    int max;

    public Nasabah04(int n){
        max = n;
        data = new Nasabah04[max];
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
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama
                + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama
                + " " + data[rear].umur + " " + data[rear].saldo);
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
                System.out.println(data[i].norek + " " + data[i].nama
                    + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama
                    + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
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

    public void enqueue(Nasabah04 dt){
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
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah04 dequeue(){
        Nasabah04 dt = null;
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
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
        return dt;
    }
}
