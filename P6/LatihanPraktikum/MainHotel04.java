public class MainHotel04 {
    public static void main(String[] args) {
        HotelService04 listHt = new HotelService04();

        Hotel_04 H = new Hotel_04("Garuda", "Ponorogo", 200000, 1);
        Hotel_04 H1 = new Hotel_04("Maesa", "Malang", 300000, 2);
        Hotel_04 H2 = new Hotel_04("Indah", "Caruban", 40000,3);
        Hotel_04 H3 = new Hotel_04("Permata", "Nganjuk", 50000, 4);
        Hotel_04 H4 = new Hotel_04("Kencana", "Solo", 60000, 5);

        listHt.tambah(H);
        listHt.tambah(H1);
        listHt.tambah(H2);
        listHt.tambah(H3);
        listHt.tambah(H4);

        System.out.println("*********************************");
        System.out.println("Data sebelum diurutkan = ");
        listHt.tampilAll();

        System.out.println("Data dengan Harga termurah ke tertinggi");
        listHt.bubbleSortRt();
        listHt.tampilAll();

        System.out.println("*********************************");
        System.out.println("Data dengan Rate tertinggi ke terendah");
        listHt.selectionSortRt();
        listHt.tampilAll();
    }
}
