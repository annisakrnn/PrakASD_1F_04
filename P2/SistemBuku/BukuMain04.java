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

        Buku04 bk2 = new Buku04();
        bk2.judul = "How to Train Your Dragon";
        bk2.pengarang = "Cressida Cowell";
        bk2.halaman = 432;
        bk2.stok = 0;
        bk2.harga = 275000;

        bk2.tampilInformasi();
        bk2.terjual(0);
        bk2.gantiHarga(60000);
        bk2.tampilInformasi();

    }
}
