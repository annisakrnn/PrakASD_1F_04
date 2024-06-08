import java.util.Scanner;
public class graphmainn04 {

        public static void menu() {
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("  PILIHAN MENU  ");
            System.out.println("+++++++++++++++++++++++++");
            System.out.println(" 1. Add Edge\n 2. Remove Edge\n 3. Degree\n 4. Print Graph\n 5. Cek Edge\n 6. Hitung edge\n 7. Keluar\n");
            System.out.println("-----------------------------------");
        }
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            graph04 gedung = new graph04(6);
            int pilih;

            // Menambahkan beberapa edge awal ke dalam graf
            gedung.addEdge(0, 1, 50);
            gedung.addEdge(0, 2, 100);
            gedung.addEdge(1, 3, 70);
            gedung.addEdge(2, 3, 40);
            gedung.addEdge(3, 4, 60);
            gedung.addEdge(4, 5, 80);
    
            while (true) {
                menu();
                System.out.print("Masukkan pilihan Anda: ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan gedung asal: ");
                        int asal = sc.nextInt();
                        System.out.print("Masukkan gedung tujuan: ");
                        int tujuan = sc.nextInt();
                        System.out.print("Masukkan berat edge: ");
                        int berat = sc.nextInt();
                        gedung.addEdge(asal, tujuan, berat);
                        break;
                    case 2:
                        System.out.print("Masukkan gedung asal: ");
                        asal = sc.nextInt();
                        System.out.print("Masukkan gedung tujuan: ");
                        tujuan = sc.nextInt();
                        gedung.removeEdge(asal, tujuan);
                        break;
                    case 3:
                        System.out.print("Masukkan gedung yang ingin dicek derajatnya: ");
                        asal = sc.nextInt();
                        gedung.degree(asal);
                        break;
                    case 4:
                        gedung.printGraph();
                        break;
                    case 5:
                        System.out.print("Masukkan gedung asal: ");
                        asal = sc.nextInt();
                        System.out.print("Masukkan gedung tujuan: ");
                        tujuan = sc.nextInt();
                        if (gedung.cek(asal, tujuan)) {
                            System.out.println("Gedung " + asal + " dan " + tujuan + " bertetangga");
                        } else {
                            System.out.println("Gedung " + asal + " dan " + tujuan + " tidak bertetangga");
                        }
                        break;
                    case 6:
                    gedung.printGraph();
                    System.out.println("Total edges in the graph: " + gedung.hitungEdge());
                    break;
                    case 7:
                        System.out.println("Keluar dari program...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
}
            //gedung.makeEdge(0, 1, 50);
            //gedung.makeEdge(1, 0, 50);
            //gedung.makeEdge(1, 2, 70);
            //gedung.makeEdge(2, 1, 80);
            //gedung.makeEdge(2, 3, 40);
            //gedung.makeEdge(3, 0, 90);
            //gedung.printGraph();
            //System.out.print("Jumlah Degree setiap gedung adalah: ");
            //for (int i = 0; i < gedung.vertex; i++) {
            //gedung.degree(i);
            
            //gedung.printGraph();
            //System.out.println("Hasil setelah pengahpusan edge");
            //gedung.removeEdge(2, 1);
            //gedung.printGraph();

        
        
        //for (int i = 0; i < 2; i++) {
            //System.out.print("Masukkan gedung asal: ");
            //int asal = sc.nextInt();
            //System.out.print("Masukkan gedung tujuan: ");
            //int tujuan = sc.nextInt();

        //if (gedung.cek(asal, tujuan)) {
            //System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        //} else {
            //System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        //}

        //sc.close();

            
        
    

