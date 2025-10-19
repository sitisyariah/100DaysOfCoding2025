import java.util.Scanner;
    public class Day42.java {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nilai N: ");
            int N = input.nextInt();

            System.out.println("\nBilangan Kelipatan 3");
            for (int i = 1; i <= N; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\n\nBilangan Kelipatan 5");
            for (int i = 1; i <= N; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\n\nBilangan Kelipatan 3 dan 5");
            for (int i = 1; i <= N; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
