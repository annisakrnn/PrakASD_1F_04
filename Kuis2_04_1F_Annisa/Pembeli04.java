public class Pembeli04 {
    String nama; 
    String noHp;
    Pembeli04 prev, next;

    Pembeli04(Pembeli04 prev, String nama, String noHp, Pembeli04 next){
        this.prev= prev;
        this.nama=nama;
        this.noHp=noHp;
        this.next=next;
        }
}

