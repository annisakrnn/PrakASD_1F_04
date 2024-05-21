import java.util.Scanner;

public class vaksinasiMain {

    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(" 1. Tambah Data Penerima Vaksin\n 2. Hapus Data Pengantri Vaksin\n 3. Daftar Penerima Vaksin\n 4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        vaksin04 vk = new vaksin04();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Nomor Antrian\t: ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima\t: ");
                    String nama = sc.nextLine();
                    vk.addLast(nomor, nama);
                    break;

                case 2:
                    vk.removeFirst();
                    vk.print();
                    break;

                case 3:
                    vk.print();
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
