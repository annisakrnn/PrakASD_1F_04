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
            if (m != null) {
                m.tampilDataBuku();
            }
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listbk.length; j++) {
            if (listbk[j] != null && listbk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if(pos!=-1){
            System.out.println("Kode Buku        : " + x);
            System.out.println("Judul            : "+listbk[pos].judulBuku);
            System.out.println("Tahun Terbit     : "+listbk[pos].tahunTerbit);
            System.out.println("Pengarang        : "+listbk[pos].pengarang);
            System.out.println("Stock            : "+listbk[pos].stock);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right ) / 2;
            if (cari == listbk[mid].kodeBuku) {
                return mid;
            }
            else if (listbk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid - 1);
            }
            return FindBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }
}
