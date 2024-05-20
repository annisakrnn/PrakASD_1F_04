public class kemhasMain {
    public static void main(String[] args) {
        kemhas04 mhs = new kemhas04();

        mhs.addFirst("Anton", 111);
        mhs.print();
        mhs.addLast("Prita", 112);
        mhs.print();
        mhs.addLast("Yusuf", 113);
        mhs.print();
        mhs.addLast("Doni", 114);
        mhs.print();
        mhs.addLast("Sari", 115);
        mhs.print();

        System.out.println("Antrian layanan unit kemahasiswaan:");
        mhs.print();

        
    }
}
