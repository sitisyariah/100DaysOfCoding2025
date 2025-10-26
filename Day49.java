import java.util.Scanner;

public class Day49{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Operator ternary untuk menentukan genap atau ganjil
        String hasil = (angka % 2 == 0) ? "Angka genap" : "Angka ganjil";

        System.out.println("Hasil: " + hasil);
    }
}
