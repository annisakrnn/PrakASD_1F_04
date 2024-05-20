public class kemhasMain {
    public static void main(String[] args) {
        kemhas04 mhs = new kemhas04();

        mhs.addFirst("Anton", 111);
        mhs.addLast("Prita", 112);
        mhs.addLast("Yusuf", 113);
        mhs.addLast("Doni", 114);
        mhs.addLast("Sari", 115);

        System.out.println("Antrian layanan unit kemahasiswaan:");
        mhs.print();

        System.out.println("\nMahasiswa yang telah dilayani:");
        kemahasiswaan04 temp = mhs.removeFirst();
        if (temp != null) {
            System.out.println("NIM: " + temp.nim + ", Nama: " + temp.nama);
        }

        System.out.println("\nAntrian setelah satu mahasiswa dilayani:");
        mhs.print();
    }
}
