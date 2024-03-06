package AOBPersegiPanjang;

import ArrayBalok.Segitiga04;

public class BangunMain04 {
    public static void main(String[] args) {
        Segitiga04 sg1 = new Segitiga04(5, 10);
        Segitiga04 sg2 = new Segitiga04(10, 15);
        Segitiga04 sg3 = new Segitiga04(10, 15);
        PersegiPanjang04 pp1 = new PersegiPanjang04(5, 10);
        PersegiPanjang04 pp2 = new PersegiPanjang04(2, 8);
        PersegiPanjang04 pp3 = new PersegiPanjang04(10, 15);

        Segitiga04[] s = {sg1, sg2, sg3};
        PersegiPanjang04[] p = {pp1, pp2, pp3};

        Bangundatar04 bd = new Bangundatar04();
        bd.tambahSgt(s);
        bd.tambahPP(p);
        bd.tampilBangunDatar();
    }
}
