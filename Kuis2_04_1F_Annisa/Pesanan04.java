public class Pesanan04 {
    int kodePesanan; 
    String namaPesanan;
    int harga;
    Pesanan04 prev, next;

    Pesanan04(Pesanan04 prev, int kodePesanan, String namaPesanan, int harga, Pesanan04 next){
        this.prev= prev;
        this.kodePesanan=kodePesanan;
        this.namaPesanan=namaPesanan;
        this.harga=harga;
        this.next=next;
        }
}

