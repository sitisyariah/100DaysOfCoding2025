import java.util.Scanner;
public class Day61{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai N dan M
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + ":");
        // Perulangan dari 1 sampai N
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) { // jika i habis dibagi M
                System.out.print(i + " ");
            }
        }
    }
}
