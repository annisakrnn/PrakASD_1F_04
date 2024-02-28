package SistemBuku;

public class BukuMain04 {
    public static void main(String[] args) {
        Buku04 Bk1 = new Buku04();
        Bk1.judul = "Today Ends Tomorrow Comes";
        Bk1.pengarang = "Denada Pratiwi";
        Bk1.halaman = 198;
        Bk1.stok = 13;
        Bk1.harga = 71000;

        Bk1.tampilInformasi();
        Bk1.terjual(5);
        Bk1.gantiHarga(60000);
        Bk1.tampilInformasi();
    }
}
