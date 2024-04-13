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
        for (int i = 0; i < idx; i++) { // Menggunakan idx sebagai batas iterasi agar tidak menampilkan elemen null
            listbk[i].tampilDataBuku(); // Menampilkan data buku menggunakan metode tampilDataBuku()
        }
    }

    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                // Perbaikan penulisan listbk[minIdx].judulBuku
                if (listbk[j].judulBuku.compareToIgnoreCase(listbk[minIdx].judulBuku) < 0) {
                    minIdx = j;
                }
            }
            // Memindahkan perintah penempatan ke dalam loop selectionSort
            buku04 temp = listbk[minIdx];
            listbk[minIdx] = listbk[i];
            listbk[i] = temp;
        }
    }

    public int FindSeqSearch(String judul) {
        int count = -1;
        for (int j = 0; j < idx; j++) { // Menggunakan idx sebagai batas iterasi
            if (listbk[j].judulBuku.equalsIgnoreCase(judul)) { // Menggunakan equalsIgnoreCase() untuk pencarian
                count = j;
                break;
            }
        }
        return count;
    }

    public int FindBinarySearch(String judul) {
        selectionSort(); // Memanggil selectionSort sebelum pencarian

        int left = 0;
        int right = idx - 1;
        int count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = judul.compareToIgnoreCase(listbk[mid].judulBuku);
            if (res == 0) {
                count++;
                int temp = mid - 1;
                while (temp >= left && listbk[temp].judulBuku.equalsIgnoreCase(judul)) {
                    count++;
                    temp--;
                }
                temp = mid + 1;
                while (temp <= right && listbk[temp].judulBuku.equalsIgnoreCase(judul)) {
                    count++;
                    temp++;
                }
                if (count > 1) {
                    System.out.println("Peringatan: terdapat lebih dari satu buku dengan judul \"" + judul + "\".");
                }
                return count;
            }
            if (res < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (count == 0) {
            System.out.println("Peringatan: judul \"" + judul + "\" tidak ditemukan.");
        }
        return count;

    }

    public void tampilposisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
