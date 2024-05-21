public class vaksinasi04 {
    int nomor; 
    String nama;
    vaksinasi04 prev, next;

    vaksinasi04(vaksinasi04 prev, int nomor, String nama, vaksinasi04 next){
        this.prev= prev;
        this.nomor=nomor;
        this.nama=nama;
        this.next=next;
        }
}


