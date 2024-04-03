import java.util.Scanner;

public class bukuMain04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        PencarianBuku04 data = new PencarianBuku04();
        int jumBuku = 5;

        System.out.println("------------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for(int i = 0; i < jumBuku; i++){
            System.out.println("====================");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            s.nextLine(); // Menambahkan s.nextLine() untuk membaca newline
            System.out.print("Judul Buku \t : ");
            String judulBuku = s.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            s.nextLine(); // Menambahkan s.nextLine() untuk membaca newline
            System.out.print("Pengarang \t : ");
            String pengarang = s.nextLine();
            System.out.print("Stock \t : ");
            int stock = s.nextInt();

            buku04 m = new buku04(kodeBuku, judulBuku, tahunTerbit, pengarang, stock); // Memperbaiki objek m
            data.tambah(m);
        }
        System.out.println("==================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("--------------------------");
        System.out.println("Pencaarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilposisi(cari, posisi);


    }
}
