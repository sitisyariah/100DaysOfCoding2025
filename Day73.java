import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Es teh");
            System.out.println("2. jus jeruk");
            System.out.println("3. Capucino");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Penjumlahan!");
                    break;

                case 2:
                    System.out.println("Anda memilih Perkalian!");
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }

            System.out.println(); 
        } while (pilihan != 3); 
    }
}
