package ArrayBalok;

public class Balok04 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok04(int p, int i, int t)
    {
        panjang = p;
        lebar = i;
        tinggi = t;
    }
    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
}
