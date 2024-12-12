import java.util.Scanner;

public class Assesment2 {
    public static double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        double luas = hitungLuas(alas, tinggi);

        System.out.println("Luas segitiga adalah: " + luas);
    }
}
