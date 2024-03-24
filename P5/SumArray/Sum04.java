public class Sum04 {
    String nama;
    int elemen;
    double[] keuntungan;

    public Sum04(String nama, int elemen) {
        this.nama = nama;
        this.elemen = elemen;
        keuntungan = new double[elemen];
    }

    public double hitungTotalKeuntungan() {
        double total = 0;
        for (double k : keuntungan) {
            total += k;
        }
        return total;
    }
}