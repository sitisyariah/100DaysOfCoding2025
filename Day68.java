import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        for (int i = 0; i < baris; i++) {          // perulangan baris
            for (int j = 0; j < kolom; j++) {      // perulangan kolom
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
