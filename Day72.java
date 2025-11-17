import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {        // baris dimulai dari n ke 1
            for (int j = 1; j <= i; j++) {    // mencetak bintang sebanyak nilai i
                System.out.print("*");
            }
            System.out.println();             // pindah ke baris berikutnya
        }
    }
}
