import java.util.Scanner;
    public class Day39.java {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== MENU MINUMAN ===");
            System.out.println("1. Es Teh");
            System.out.println("2. Kopi");
            System.out.println("3. Jus Jeruk");
            System.out.print("Pilih minuman (1-3): ");

            System.out.print("menu yang di pilih : ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                System.out.println("Anda memilih Es Teh.");
            }
            else if (pilih == 2) {
                System.out.println("Anda memilih Kopi.");
            }
            else if (pilih == 3) {
                System.out.println("Anda memilih Jus Jeruk.");
            }
            else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
