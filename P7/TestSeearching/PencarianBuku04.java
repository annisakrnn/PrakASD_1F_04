public class PencarianBuku04 {
    buku04[] listbk = new buku04[5];
    int idx;

    public void tambah(buku04 m) {
        if (idx < listbk.length) {
            listbk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (buku04 m : listbk) {
            m.tampilDataBuku();
        }
    }

    public buku04 FindBuku(int cari){
        buku04 posisi = null;
        for(int j=0; j < listbk.length; j++){
            if(listbk[j].kodeBuku == cari){
                posisi = listbk[j];
                break;
            }
        }
        return posisi;
    }

    public void tampilDataBuku(buku04 buku) { // Ganti pod menjadi pos
        if (buku != null) {
            buku.tampilDataBuku();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
