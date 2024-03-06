package ArrayBalok;

public class SegitigaMain04 {
    public static void main(String[] args) {
        Segitiga04[] sgArray = new Segitiga04[4];

        sgArray[0] = new Segitiga04(10, 4);
        sgArray[1] = new Segitiga04(20, 10);
        sgArray[2] = new Segitiga04(15, 6);
        sgArray[3] = new Segitiga04(25, 10);

        for(int i = 0; i < 4; i++) {
            System.out.println("Luas segitiga ke " + i + ": " + sgArray[i].hitungLuas());
        }
        for(int i = 0; i < 4; i++) {
            System.out.println("Keliling segitiga ke " + i + ": " + sgArray[i].hitungKeliling());
    }
}
}
