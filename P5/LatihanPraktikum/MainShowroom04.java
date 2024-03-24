public class MainShowroom04 {
    public static void main(String[] args) {
        Showroom04[] mobilList = {
            new Showroom04("BMW", "M2 Coupe", 2016, 6816, 728),
            new Showroom04("Ford", "Fiesta ST", 2014, 3921, 575),
            new Showroom04("Nissan", "370Z", 2009, 4360, 657),
            new Showroom04("Subaru", "BRZ", 2014, 4058, 609),
            new Showroom04("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Showroom04("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Showroom04("Toyota", "86/GT86", 2014, 4180, 609),
            new Showroom04("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int topAcceleration = findMaxAcceleration(mobilList, 0, mobilList.length - 1);
        System.out.println("Top Acceleration Tertinggi Dengan Divide Conquer: " + topAcceleration);

        int minAcceleration = findMinAcceleration(mobilList, 0, mobilList.length - 1);
        System.out.println("Top Acceleration Terendah Dengan Divide Conquer: " + minAcceleration);

        double averagePower = calculateAveragePower(mobilList);
        System.out.println("Rata-rata Top Power dari Seluruh Mobil Dengan Brute Force: " + averagePower);
    }

    static int findMaxAcceleration(Showroom04[] arr, int low, int high) {
        if (low == high) {
            return arr[low].topAcceleration;
        } else if (high == low + 1) {
            return Math.max(arr[low].topAcceleration, arr[high].topAcceleration);
        } else {
            int mid = (low + high) / 2;
            int leftMax = findMaxAcceleration(arr, low, mid);
            int rightMax = findMaxAcceleration(arr, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

    static int findMinAcceleration(Showroom04[] arr, int low, int high) {
        if (low == high) {
            return arr[low].topAcceleration;
        } else if (high == low + 1) {
            return Math.min(arr[low].topAcceleration, arr[high].topAcceleration);
        } else {
            int mid = (low + high) / 2;
            int leftMin = findMinAcceleration(arr, low, mid);
            int rightMin = findMinAcceleration(arr, mid + 1, high);
            return Math.min(leftMin, rightMin);
        }
    }

    static double calculateAveragePower(Showroom04[] arr) {
        int totalPower = 0;
        for (Showroom04 mobil : arr) {
            totalPower += mobil.topPower;
        }
        return (double) totalPower / arr.length;
    }
}