import java.util.Scanner;

public class Pemilihan_04 {
    public static void main(String[] args) {
        Scanner input04Scanner = new Scanner(System.in);

        //Tampilan Awal
        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("==============================");

        Scanner input04 = new Scanner(System.in);
        String nilaiHuruf = "", keterangan = "";

        
        System.out.print("Nilai tugas   : ");
        float uas = input04.nextFloat();
        System.out.print("Nilai kuis   : ");
        float uts = input04.nextFloat();
        System.out.print("Nilai UTS  : ");
        float kuis = input04.nextFloat();
        System.out.print("Nilai UAS : ");
        float tugas = input04.nextFloat();

        if (!((tugas >= 0 && tugas <= 100) && (kuis >= 0 && kuis <= 100) && (uts >= 0 && uts <= 100) && (uas >= 0 && uas <= 100))) {
            System.out.println("nilai tidak valid");;
        }else {
            double nilaiAkhir = (tugas * 0.4F) + (kuis * 0.3F) + (uts * 0.1F) + (uas * 0.2F);

        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Nilai AKhir; " + nilaiAkhir);
        

        if (nilaiAkhir >= 80 && nilaiAkhir < 100) {
            System.out.println("Nilai Huruf A");
        }else if  (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Huruf B+");
        }else if  (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai Huruf B");
        }else if  (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Huruf C+");
        }else if  (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Huruf C");
        }else if  (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai Huruf D");
        }else {
            System.out.println("Nilai Huruf E");
    }
            System.out.println("==========================");
            if (nilaiAkhir >=80) {
                System.out.println("Keterangan : Sangat Baik (LULUS)");
            }else if (nilaiAkhir >=73) {
                System.out.println("Keterangan : Lebih Dari Baik (LULUS)");
            }else if (nilaiAkhir >=65) {
                System.out.println("Keterangan : Baik (LULUS)");
            }else if (nilaiAkhir >=60) {
                System.out.println("Keterangan : Lebih Dari Cukup (LULUS)");
            }else if (nilaiAkhir >=50) {
                System.out.println("Keterangan : Cukup(LULUS)");
            } else {
                System.out.println("Keterangan : Kurang (TIDAK LULUS)");
                System.out.println("Keterangan : Gagal (TIDAK LULUS)");
        }
    }
    }
}