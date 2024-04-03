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

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listbk.length; j++) {
            if (listbk[j].kodeBuku == cari) {
                posisi = 0; // Perbarui nilai posisi jika data ditemukan
                break;
            }
        }
        return posisi; // Kembalikan nilai posisi
    }

    public void tampilposisi(int x, int pos) { // Ganti pod menjadi pos
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
