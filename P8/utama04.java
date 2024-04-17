import java.util.Scanner;

public class utama04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        gudang04 gudang = new gudang04(7);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan lihat barang teratas");
            System.out.println("5. Tampilkan lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    barang04 barangBaru = new barang04(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan nama barang yang ingin dicari: ");
                    String barangDicari = sc.nextLine();
                    barang04 barangHasilCari = gudang.cariBarang(barangDicari);
                    if (barangHasilCari != null) {
                        System.out.println("Barang ditemukan: " + barangHasilCari.nama);
                    } else {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.println("Program selesai.");
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
