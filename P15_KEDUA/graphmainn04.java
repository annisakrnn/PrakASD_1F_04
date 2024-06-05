import java.util.Scanner;
public class graphmainn04 {

        public static void main(String[] args) throws Exception{
            Scanner sc = new Scanner(System.in);
            //graph04 gedung = new graph04(6);
            GraphMatriks04 gedung = new GraphMatriks04(4);

        //gedung.addEdge(2, 3, 10); 
        //gedung.addEdge(3, 2, 10); 
        //gedung.addEdge(3, 4, 10); 
        //gedung.addEdge(4, 3, 10); 

    
            gedung.makeEdge(0, 1, 50);
            gedung.makeEdge(1, 0, 50);
            gedung.makeEdge(1, 2, 70);
            gedung.makeEdge(2, 1, 80);
            gedung.makeEdge(2, 3, 40);
            gedung.makeEdge(3, 0, 90);
            gedung.printGraph();
            System.out.print("Jumlah Degree setiap gedung adalah: ");
            for (int i = 0; i < gedung.vertex; i++) {
            gedung.degree(i);
            }
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

            
        }
    }

