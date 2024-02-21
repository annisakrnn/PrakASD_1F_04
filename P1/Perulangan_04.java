import java.util.Scanner;

public class Perulangan_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input NIM
        System.out.print("Input NIM: ");
        String nim = scanner.next();

        int n = Integer.parseInt("" + nim.charAt(nim.length()-2) + nim.charAt(nim.length()-1));
        System.out.println("n = " + n);

        if (n < 10) {
            n += 10;
        }
    
        // Menampilkan deretan bilangan dengan ketentuan
        for (int i = 1; i <= n; i++) {
            // Cek apakah bilangan sama dengan 6 atau 10
            if (i == 6 || i == 10) {
                continue; // Lewati bilangan 6 dan 10
            }

            // Cek apakah bilangan ganjil atau genap
            if (i % 2 == 0) {
                System.out.print(i + " "); // Cetak bilangan genap
            } else {
                System.out.print("* "); // Cetak asterisk untuk bilangan ganjil
            }
        }
    }
}