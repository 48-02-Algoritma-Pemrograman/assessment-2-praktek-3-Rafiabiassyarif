import java.util.ArrayList;
import java.util.Scanner;

public class nomor2 {
    public static double hitungTotal(double Hampers, double Packing) {
        return Hampers + Packing;
    }

    public static double hitungTotalBayar(ArrayList<Double> totalBiaya) {
        double total = 0;
        for (double biaya : totalBiaya) {
            total += biaya;
        }
        return total + (total * 0.1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> totalBiaya = new ArrayList<>();

        while (true) {
            System.out.println("Menu Hampers:");
            System.out.println("1. 2 Kue kering dan 3 Kue Basah (Rp 150.000)");
            System.out.println("2. 3 Kue Kering dan 2 Kue Basah (Rp 175.000)");
            System.out.println("3. 3 Kue Kering dan 3 Kue Basah (Rp 200.000)");
            System.out.print("Pilih paket hamper (1/2/3): ");
            int pilihanHampers = scanner.nextInt();

            System.out.println("Menu Packing:");
            System.out.println("1. Pita (Rp 50.000)");
            System.out.println("2. Kartu (Rp 75.000)");
            System.out.println("3. Pita + Kartu (Rp 125.000)");
            System.out.print("Pilih paket packing (1/2/3): ");
            int pilihanPacking = scanner.nextInt();

            int Hampers = 0;
            int Packing = 0;

            switch (pilihanHampers) {
                case 1:
                    Hampers = 150000;
                    break;
                case 2:
                    Hampers = 175000;
                    break;
                case 3:
                    Hampers = 200000;
                    break;
            }

            switch (pilihanPacking) {
                case 1:
                    Packing = 50000;
                    break;
                case 2:
                    Packing = 75000;
                    break;
                case 3:
                    Packing = 125000;
                    break;
            }

            double total = hitungTotal(Hampers, Packing);
            totalBiaya.add(total);

            System.out.print("Apakah ingin memesan lagi? (y/n): ");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
        }

        double totalBayar = hitungTotalBayar(totalBiaya);
        System.out.println("Total bayar: Rp " + totalBayar);
    }
}
