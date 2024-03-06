package ArrayBalok;

public class Segitiga04 {
    public int alas;
    public int tinggi;

    // Konstruktor untuk inisialisasi alas dan tinggi
    public Segitiga04(int a, int t) {
        alas = a;
        tinggi = t;
    }

    // Metode untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Metode untuk menghitung keliling segitiga
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}
