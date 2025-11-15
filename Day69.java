import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input tinggi dan lebar
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        // loop untuk baris
        for (int i = 0; i < tinggi; i++) {    
            // loop untuk kolom
            for (int j = 0; j < lebar; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
