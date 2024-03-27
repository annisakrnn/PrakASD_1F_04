public class MainBuku04{
    public static void main(String[] args) {
        DaftarBuku04 listBk = new DaftarBuku04();

        Buku_04 m = new Buku_04(20215, "Algoritma", 2019, "Wahyuni", 5);
        Buku_04 m1 = new Buku_04(20214, "Big Data", 2020, "Susilo", 3);
        Buku_04 m2 = new Buku_04(20212, "Desain UI", 2021, "Supriadi", 6);
        Buku_04 m3 = new Buku_04(20211, "Web Programming", 2022, "Pustaka Adi", 2);
        Buku_04 m4 = new Buku_04(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

        listBk.tambah(m);
        listBk.tambah(m1);
        listBk.tambah(m2);
        listBk.tambah(m3);
        listBk.tambah(m4);

        System.out.println("*********************************");
        System.out.println("Data sebelum diurutkan = ");
        listBk.tampil();

        System.out.println("Data setelah sorting Asc berdasarkan stock");
        listBk.bubbleSort();
        listBk.tampil();
        
    }
}