package SistemBuku;

public class BukuMain04 {
    public static void main(String[] args) {
        Buku04 Annisa = new Buku04();
        Annisa.judul = "Mariposa";
        Annisa.pengarang = "luluk HF";
        Annisa.halaman = 290;
        Annisa.stok = 1;
        Annisa.harga = 98000;
        Annisa.tampilInformasi();

        int hargaTotalAnnisa = Annisa.hitungHargaTotal(1);
        double diskonAnnisa = Annisa.hitungDiskon(98000);
        int hargaBayarAnnisa = Annisa.hitungHargaBayar(98000, 5);
        
        System.out.println("Harga Total: " + hargaTotalAnnisa);
        System.out.println("Diskon: " + diskonAnnisa);
        System.out.println("Harga Bayar: " + hargaBayarAnnisa);

    }
}
