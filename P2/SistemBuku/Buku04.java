package SistemBuku;

public class Buku04 {

    public String judul, pengarang;
    public int halaman, stok, harga;

    public Buku04() {
    }

    public Buku04(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jmlTerjual) {
        return harga * jmlTerjual;
    }

    double hitungDiskon(int totalHarga) {
        if (totalHarga > 150000) {
            return 0.12 * totalHarga;
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            return 0.05 * totalHarga;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int totalHarga, double diskon) {
        return (int) (totalHarga - diskon);
    }
}
