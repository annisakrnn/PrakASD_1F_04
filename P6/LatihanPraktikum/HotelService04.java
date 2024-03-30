public class HotelService04 {
    Hotel_04[] listHt = new Hotel_04[5];
    int idx;

    // panggil method tambah
    void tambah(Hotel_04 H) {
        if (idx < listHt.length) {
            listHt[idx] = H;
            idx++;
        } else {
            System.out.println("Hotel sudah penuh!");
        }
    }

    void tampilAll() {
        for (Hotel_04 H : listHt) {
            if (H != null) {
                H.tampildataHotel();
            }
        }
    }

    void bubbleSortHrg() {
        for (int i = 0; i < listHt.length - 1; i++) {
            for (int j = 0; j < listHt.length - i - 1; j++) {
                if (listHt[j].harga > listHt[j + 1].harga) {
                    Hotel_04 tempHt = listHt[j];
                    listHt[j] = listHt[j + 1];
                    listHt[j + 1] = tempHt;
                }
            }
        }
    }

    void bubbleSortRt() {
        for (int i = 0; i < listHt.length - 1; i++) {
            for (int j = 0; j < listHt.length - i - 1; j++) {
                if (listHt[j].bintang > listHt[j + 1].bintang) {
                    Hotel_04 tempHt = listHt[j];
                    listHt[j] = listHt[j + 1];
                    listHt[j + 1] = tempHt;
                }
            }
        }
    }

    void selectionSortHrg() {
        for (int i = 0; i < listHt.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listHt.length; j++) {
                if (listHt[j].harga > listHt[idxMax].harga) {
                    idxMax = j;
                }
            }
            Hotel_04 tempHt = listHt[idxMax];
            listHt[idxMax] = listHt[i];
            listHt[i] = tempHt;
        }
    }

    void selectionSortRt() {
        for (int i = 0; i < listHt.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listHt.length; j++) {
                if (listHt[j].bintang > listHt[idxMax].bintang) {
                    idxMax = j;
                }
            }
            Hotel_04 tempHt = listHt[idxMax];
            listHt[idxMax] = listHt[i];
            listHt[i] = tempHt;
        }
    }
}
