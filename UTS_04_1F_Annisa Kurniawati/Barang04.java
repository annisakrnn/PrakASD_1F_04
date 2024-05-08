public class Barang04 {
    String kodeBarang;
    String nama;
    String kategori;
    int Stok;
    int Harga;


    public Barang04(String kodeBarang, String nama, String kategori, int Stok, int Harga){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.Stok = Stok;
        this.Harga = Harga;

    }

public void TampilDataBarang(){
    System.out.println("=========================");
    System.out.println("Kode barang : " + kodeBarang);
    System.out.println("Nama barang : " + nama);
    System.out.println("Kategori    : " + kategori);
    System.out.println("Stok        : " + Stok);
    System.out.println("Harga       : " + Harga);
}
}
