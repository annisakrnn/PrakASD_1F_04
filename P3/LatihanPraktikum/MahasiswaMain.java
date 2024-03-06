package LatihanPraktikum;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04[] mahasiswaArray = new Mahasiswa04[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            mahasiswaArray[i] = new Mahasiswa04(nama, nim, jenisKelamin, ipk);
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            mahasiswaArray[i].infoMahasiswa(i);
        }
    }
}
