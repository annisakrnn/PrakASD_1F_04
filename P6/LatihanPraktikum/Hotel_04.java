public class Hotel_04 {
    String nama;
    String kota;
    int harga;
    int bintang;

public Hotel_04(String nama, String kota, int harga, int bintang){
    this.nama = nama;
    this.kota = kota;
    this.harga = harga;
    this.bintang = bintang;
    
}
void tampildataHotel(){
    System.out.println("=======================");
    System.out.println("Nama Hotel  :"+nama);
    System.out.println("Kota        :"+kota);
    System.out.println("Harga       :"+harga);
    System.out.println("Rate        :"+bintang);
}
}
