import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilih = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        double hasil = 0; 

        if (pilih == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan = " + hasil);
        } else if (pilih == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan = " + hasil);
        } else if (pilih == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian = " + hasil);
        } else if (pilih == 4) {
            if (angka2 == 0) {
                System.out.println("Error: Tidak bisa membagi dengan nol!");
            } else {
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian = " + hasil);
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
