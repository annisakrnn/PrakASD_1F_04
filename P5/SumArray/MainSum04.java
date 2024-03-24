import java.util.Scanner;

public class MainSum04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Keuntungan Perusahaan");
        System.out.println("===================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int nPerusahaan = sc.nextInt();

        Sum04[] perusahaan = new Sum04[nPerusahaan];

        for (int i = 0; i < nPerusahaan; i++) {
            sc.nextLine();
            System.out.println("Data Perusahaan " + (i + 1));
            System.out.print("Masukkan nama perusahaan : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jumlah bulan : ");
            int nBulan = sc.nextInt();

            perusahaan[i] = new Sum04(nama, nBulan);

            for (int j = 0; j < nBulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + ": ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }

        double totalKeuntungan = 0;
        for (Sum04 p : perusahaan) {
            totalKeuntungan += p.hitungTotalKeuntungan();

        System.out.println("===================================");
        System.out.println("Total keuntungan dari semua perusahaan: " + totalKeuntungan);
    }
}
}