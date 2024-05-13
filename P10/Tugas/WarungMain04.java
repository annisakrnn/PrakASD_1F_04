import java.util.Scanner;
public class WarungMain04 {
    
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        WarungQueue04 antrian = new WarungQueue04(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    sc.nextLine();
                    System.out.print("No.Hp: ");
                    int noHp = sc.nextInt();
                    Warung04 nb = new Warung04(nama, noHp);
                    antrian.enqueue(nb);
                    break;
                case 2:
                    Warung04 data = antrian.dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                    }
                } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
            }
        }
    

