import java.util.Scanner;

public class BilanganFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Membuat objek Scanner untuk input

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();                  // Membaca bilangan dari pengguna

        long hasil = 1;                           // Variabel untuk menyimpan hasil faktorial

        System.out.print("Hasil dari " + n + "! = ");
        for (int i = n; i >= 1; i--) {            // Perulangan dari n ke 1
            hasil *= i;                           // Perkalian faktorial

            // Menampilkan proses perkalian
            if (i > 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " = ");
            }
        }

        System.out.println(hasil);                // Menampilkan hasil akhir
    }
}
