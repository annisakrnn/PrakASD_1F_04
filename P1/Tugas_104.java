import java.util.Scanner;
public class Tugas_104 {
    public static void main(String[] args) {
      
        char[] KODE = {'A','B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        
        String[][] KOTA = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Tegal"},
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char kodePlat = scanner.next().charAt(0);
        String namaKota = cariKota(KODE, KOTA, kodePlat);
        
        if (namaKota != null) {
            System.out.println("Kota yang berpasangan dengan kode plat nomor " + kodePlat + " adalah: " + namaKota);
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }
    }

    public static String cariKota(char[] KODE, String[][] KOTA, char kodePlat) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                return KOTA[i][0]; 
            }
        }
        return null; 
    }
}
