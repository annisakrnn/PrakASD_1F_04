public class MainSistem04 {
    public static void main(String[] args) {
        TransaksiPembelian04 brg = new TransaksiPembelian04();

        Barang04 b = new Barang04("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang04 b1 = new Barang04("Br002", "You c1000 Botol", "Minuman", 10, 7000);
        Barang04 b2 = new Barang04("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        Barang04 b3 = new Barang04("Br004", "Rinso Cair", "Sabun", 10, 7000);
        Barang04 b4 = new Barang04("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);
        
        brg.tambah(b);
        brg.tambah(b1);
        brg.tambah(b2);
        brg.tambah(b3);
        brg.tambah(b4);

        System.out.println("*********************************");
        System.out.println("Data sebelum diurutkan = ");
        brg.TampilDataBarang();

        System.out.println("Data setelah sorting Asc berdasarkan stock");
        brg.bubbleSort();
        brg.TampilDataBarang();

        System.out.println("*********************************");
        System.out.println("Data setelah diurutkan secara Desc berdasarkan stock Menggunakan selection short");
        brg.selectionSort();
        brg.TampilDataBarang();

        System.out.println("*********************************");
        System.out.println("Data setelah diurutkan secara Des berdasarkan stock Menggunakan inshertion short");
        brg.insertSort();
        brg.TampilDataBarang();;
    }
}
