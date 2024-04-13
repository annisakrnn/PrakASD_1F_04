import java.util.Scanner;

public class bukuMain04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PencarianBuku04 data = new PencarianBuku04();
        int jumBuku = 5;

        System.out.println("------------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for(int i = 0; i < jumBuku; i++) {
            System.out.println("====================");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s.nextLine(); // Ubah ke s.nextLine() agar kode buku bisa dimasukkan
            System.out.print("Judul Buku \t : ");
            String judulBuku = s.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            s.nextLine(); 
            System.out.print("Pengarang \t : ");
            String pengarang = s.nextLine();
            System.out.print("Stock \t : ");
            int stock = s.nextInt();
            s.nextLine(); // Menambahkan s.nextLine() untuk membersihkan buffer
            // buku04 m = new buku04(kodeBuku, judulBuku, tahunTerbit, pengarang, stock); // Menggunakan konstruktor buku04 yang sesuai
            buku04 m = new buku04(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        data.selectionSort();

        System.out.println("--------------------------");
        System.out.println("Pencarian Judul Buku : ");
        System.out.println("Masukkan Judul Buku yang dicari");
        System.out.print("Judul Buku : ");
        String cariJudul = s.nextLine(); // Ubah cari menjadi cariJudul agar sesuai dengan variabel yang digunakan
        System.out.println("menggunakan sequential search");
        int countSeq = data.FindSeqSearch(cariJudul); // Menggunakan variabel cariJudul untuk pencarian
        System.out.println("Jumlah buku dengan judul : " + cariJudul + "\" adalah: " + countSeq);
        
        
        System.out.println("---------------------------");
        System.out.println("menggunakan binary search");
        int countBinary = data.FindBinarySearch(cariJudul); // Menggunakan variabel cariJudul untuk pencarian
        System.out.println("Jumlah buku dengan judul \"" + cariJudul+ "\" adalah: " + countBinary); 
    }

}
