package AOBPersegiPanjang;

public class MahasiswaMain04 {
    public static void main(String[] args) {

        Mahasiswa04[][] Mhs = new Mahasiswa04[2][2];

        Mhs[0][0] = new Mahasiswa04("John", "23417200700");
        Mhs[0][1] = new Mahasiswa04("Alice", "2341720089");

        for (int i = 0; i < Mhs.length; i++) {
            for (int j = 0; j < Mhs[i].length; j++) {
                System.out.println("Nama: " + Mhs[i][j].getNama() + ", Nim: " + Mhs[i][j].getNim());
            }
        }
    }
}
