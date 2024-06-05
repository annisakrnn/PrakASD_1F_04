import java.util.Scanner;
public class graphmainn04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        graph04 gedung = new graph04(6);

        
        gedung.addEdge(2, 3, 10);
        gedung.addEdge(3, 2, 10);
        gedung.addEdge(3, 4, 10);
        gedung.addEdge(4, 3, 10);

        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan gedung asal: ");
            int asal = sc.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = sc.nextInt();

            if (gedung.cek(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }
            System.out.println();
        }
        sc.close();
    }
}