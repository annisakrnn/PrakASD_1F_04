public class Fungsi_104 {
    public static void main(String[] args) {
        
        int[][] StockBunga = {
            {1, 10, 5, 15},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] pendapatanCabang = new int[StockBunga.length];

        for (int i = 0; i < StockBunga.length; i++) {
            for (int j = 0; j < StockBunga[i].length; j++) {
                pendapatanCabang[i] += Math.min(StockBunga[i][j], StockBunga[i].length) * hargaBunga[j];
            }
        }

        System.out.println("Pendapatan Setiap Cabang jika Semua Bunga Terjual:");
        System.out.println("==================================================");
        for (int i = 0; i < pendapatanCabang.length; i++) {
            System.out.println("Cabang " + (i + 1) + ": Rp " + pendapatanCabang[i]);
       
        }
    }
}