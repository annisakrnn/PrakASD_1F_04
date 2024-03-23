import java.util.Scanner;

public class MainPangkat04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat04[] png = new Pangkat04[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat04();
            System.out.print("Masukkan nilai yang akan dipangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            png[i].pangkat = sc.nextInt();
        }
        
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
            + png[i].nilai + " pangkat "
            + png[i].pangkat + " adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " 
            + png[i].nilai + " pangkat " 
            + png[i].pangkat + " adalah " 
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}