import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBiaya = 0;
        int jumlahPesan = 0;

        while (true) {
            System.out.println("Pilih Paket Hampers:");
            System.out.println("1. 2 Kue kering dan 3 Kue Basah (Rp 150.000)");
            System.out.println("2. 3 Kue Kering dan 2 Kue Basah (Rp 175.000)");
            System.out.println("3. 3 Kue Kering dan 3 Kue Basah (Rp 200.000)");
            System.out.print("Masukan pilihan hampers [1/2/3]: ");
            int pilihanHampers = scanner.nextInt();

            System.out.println("Pilih Paket Packing:");
            System.out.println("1. Pita (Rp 50.000)");
            System.out.println("2. Kartu (Rp 75.000)");
            System.out.println("3. Pita + Kartu (Rp 125.000)");
            System.out.print("Masukan pilihan packing [1/2/3]: ");
            int pilihanPacking = scanner.nextInt();

            double total = hitungTotalBiaya(pilihanHampers, pilihanPacking);
            totalBiaya += total;
            jumlahPesan++;

            System.out.print("Input lagi (Y/N)?: ");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("N")) {
                break;
            }
        }

        double totalBayar = hitungTotalBayar(totalBiaya);
        System.out.println("Total hamper yang dipesan = " + jumlahPesan);
        System.out.println("Total yang harus dibayar = Rp " + totalBayar);
    }

    public static double hitungTotalBiaya(int pilihanHampers, int pilihanPacking) {
        double Hampers = 0;
        double Packing = 0;

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

        return Hampers + Packing;
    }

    public static double hitungTotalBayar(double totalBiaya) {
        return totalBiaya * 0.1; 
    }
}
