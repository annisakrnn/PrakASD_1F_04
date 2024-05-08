public class TransaksiPembelian04 {
    
    Barang04 brg[] = new Barang04[5];
    String namaPembeli;
    String kodeTransaksi;
    String tanggalPembelian;
    int qty;

public void tambah(Barang04 b){
    if (qty < brg.length){
        brg[qty] = b;
        qty++;
    }else{
        System.out.println("Barang sudah Penuh");
    }
}
void TampilDataBarang(){
    for(Barang04 b : brg){
        b.TampilDataBarang();
    }
}
void bubbleSort(){
    for(int i = 0; i < brg.length - 1; i++){
        for(int j = 0; j < brg.length-i-1; j++){
            if(brg[j].Stok > brg[j+1].Stok){
                Barang04 tempBk = brg[j];
                brg[j] = brg[j+1];
                brg[j+1] = tempBk;
            }
        }
    }
}

void selectionSort() {
    for(int i = 0; i < brg.length - 1; i++){
        int idxMax = i;
        for(int j = i + 1; j < brg.length; j++){
            if(brg[j].Stok > brg[idxMax].Stok){
                idxMax = j;
            }
        }
        //swap
        Barang04 tempBk = brg[idxMax];
        brg[idxMax] = brg[i];
        brg[i] = tempBk;
    }
}

void insertSort(){
    for(int i = 1; i < brg.length; i++){
        Barang04 temp = brg[i];
        int j =i;
        while (j < 0 && brg[j - 1].Stok> temp.Stok) {
            brg[j] = brg[j - 1];
            j--;
            
        }
        brg[j] = temp;
    }
}
}



