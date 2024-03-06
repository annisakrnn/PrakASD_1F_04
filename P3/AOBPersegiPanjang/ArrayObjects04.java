package AOBPersegiPanjang;
import java.util.Scanner;
public class ArrayObjects04 {
    public static void main(String[] args) {
        PersegiPanjang04[] ppArray = new PersegiPanjang04[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang04();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar); 
        }
    }


}
