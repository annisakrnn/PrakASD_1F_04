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
            s.nextLine(); // Membersihkan buffer
            System.out.print("Judul Buku \t : ");
            String judulBuku = s.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            s.nextLine(); // Membersihkan buffer
            System.out.print("Pengarang \t : ");
            String pengarang = s.nextLine();
            System.out.print("Stock \t : ");
            int stock = s.nextInt();

            buku04 m = new buku04(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("==================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("--------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        System.out.println("---------------------------");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
        data.tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        

        
        }
    }

