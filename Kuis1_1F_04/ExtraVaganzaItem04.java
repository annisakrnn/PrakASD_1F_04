package Kuis1_04_Annisa_1F;

public class ExtraVaganzaItem04 {
    public String nama, category;
    public int stock, price;

public ExtraVaganzaItem04() {
}
public ExtraVaganzaItem04(String nm, String ct, int st, int p) {
    nama = nm;
    category = ct;
    stock = st;
    price = p;
}

void tampilInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("Category: " + category);
    System.out.println("Stock: " + stock);
    System.out.println("Price: " + price);
}

}


