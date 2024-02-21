public class Fungsi_204 {
    public static void main(String[] args) {
        // Array untuk menyimpan stok bunga pada cabang RoyalGarden 4
        int[] stokBunga = {5, 7, 12, 9};
        
        // Array untuk menyimpan informasi pengurangan stock karena bunga mati
        int[] penguranganStock = {-1, -2, 0, -5};
        
        // Memanggil fungsi hitungJumlahStock untuk menghitung jumlah stok setiap jenis bunga
        int[] jumlahStock = hitungJumlahStock(stokBunga, penguranganStock);
        
        // Menampilkan jumlah stok setiap jenis bunga
        System.out.println("Jumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden 4:");
        System.out.println("=========================================================");
        System.out.println("Aglonema: " + jumlahStock[0]);
        System.out.println("Keladi: " + jumlahStock[1]);
        System.out.println("Alocasia: " + jumlahStock[2]);
        System.out.println("Mawar: " + jumlahStock[3]);
    }

    // Fungsi untuk menghitung jumlah stok setiap jenis bunga pada cabang RoyalGarden 4
    public static int[] hitungJumlahStock(int[] stokBunga, int[] penguranganStock) {
        int[] jumlahStock = new int[stokBunga.length];
        for (int i = 0; i < stokBunga.length; i++) {
            // Hanya hitung jika stok bunga tidak negatif
            jumlahStock[i] = Math.max(stokBunga[i] + penguranganStock[i], 0);
        }
        return jumlahStock;
    }
}