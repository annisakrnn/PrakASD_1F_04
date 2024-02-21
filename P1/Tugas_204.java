import java.util.Scanner;

public class Tugas_204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Menu:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Pilih rumus yang akan dihitung (1/2/3): ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();
        
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan adalah: " + kecepatan + " km/jam");
    }

   
    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();
        
        double jarak = kecepatan * waktu;
        System.out.println("Jarak adalah: " + jarak + " km");
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();
        
        double waktu = jarak / kecepatan;
        System.out.println("Waktu adalah: " + waktu + " jam");
    }
}