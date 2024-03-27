public class DaftarBuku04 {
    Buku_04 listBk[] = new Buku_04[5];
    int idx;

    //tempat method tambah
    //tempat method tampil
    //method bubbleSort

    void tambah(Buku_04 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Buku_04 m : listBk){
            m.tampilDataBuku();
        }
    }

    void bubbleSort(){
        for(int i = 0; i < listBk.length - 1; i++){
            for(int j = 0; j < listBk.length-i-1; j++){
                if(listBk[j].stock > listBk[j+1].stock){
                    Buku_04 tempBk = listBk[j];
                    listBk[j] = listBk[j+1];
                    listBk[j+1] = tempBk; 
                }
            }
        }
    }
}
