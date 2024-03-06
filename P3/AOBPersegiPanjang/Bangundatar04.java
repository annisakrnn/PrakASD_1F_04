package AOBPersegiPanjang;

import ArrayBalok.Segitiga04;

public class Bangundatar04 {
    Segitiga04[] segitiga04s;
    PersegiPanjang04[] persegiPanjang04s;

    void tambahSgt(Segitiga04[] segitiga) {
        this.segitiga04s = segitiga;
    }

    void tambahPP(PersegiPanjang04[] persegiPanjang) {
        this.persegiPanjang04s = persegiPanjang;
    }

    void tampilBangunDatar() {
            for (int i = 0; i < persegiPanjang04s.length; i++) {
                System.out.println("Persegi Panjang " + (i + 1));
                System.out.println("Panjang: " + persegiPanjang04s[i].panjang);
                System.out.println("Lebar: " + persegiPanjang04s[i].lebar);
            }
        System.out.println("=====================================");
            for (int j = 0; j < segitiga04s.length; j++) {
                System.out.println("Segitiga " + (j + 1));
                System.out.println("Alas: " + segitiga04s[j].alas);
                System.out.println("Tinggi: " + segitiga04s[j].tinggi);
            }
        }
    }

