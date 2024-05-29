import java.util.Scanner;
public class RestoMain04 {
        public static void menu() {
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("RESTO ROYAL DELISH");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println(" 1. Tambah Antrian\n 2. Hapus Antrian\n 3. Cetak Antrian\n 4. Laporan Pengurutan Pesanan\n 5. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++");
        }
    
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            Transaksi04 vk = new Transaksi04();
            TransaksiPesanan04 tp = new TransaksiPesanan04();
            int pilih;
    
            do {
                menu();
                pilih = sc.nextInt();
                sc.nextLine(); 
    
                switch (pilih) {
                    case 1:
                        System.out.print("Nama\t: ");
                        String nama = sc.nextLine();
                        sc.nextLine();
                        System.out.print("No Hp\t: ");
                        String noHp = sc.nextLine();
                        vk.addLast(nama, noHp);
                        break;
    
                    case 2:
                        vk.removeFirst();
                        vk.print();
                        break;
    
                    case 3:
                        vk.print();
                        break;
                    case 4:
                        tp.sort();;
                        break;
                    case 5:
                    System.exit(0);
                    break;
                }
            } while (pilih >= 1 && pilih <= 5);
        }
    }
    
