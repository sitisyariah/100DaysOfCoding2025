import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai n : ");
        int n = sc.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 1){
                A += i;
            } else if (i % 2 == 0){
                B += i;
            }
            if (i % 3 == 0 && i % 5 == 0){
                C += i;
            }
            if (i % 3 == 0 || i % 5 == 0){
                D += i;
            }
        }
        System.out.println("\nA. total angka ganjil = " + A);
        System.out.println("B. total angka genap = " + B);
        System.out.println("C. total angka yang habis dibagi tiga dan lima = " + C);
        System.out.println("D. total angka yang habis dibagi tiga atau lima = " + D);

        //operator aritmatika
        int nilai1 = D * B;
        int nilai2 = C / A;
        int nilai3 = D + B;
        int nilai4 = C - A;
        int nilai5 = B % D;

        //cetak
        System.out.println("\n1. D * B = " + nilai1);
        System.out.println("2. C / A = " + nilai2);
        System.out.println("3. D + B = " + nilai3);
        System.out.println("4. C - A = " + nilai4);
        System.out.println("5. B % D = " + nilai5);

        if (nilai3 < 5){
            System.out.println("\nara");
        } else if (nilai5 > 5){
            System.out.println("\nara ara");
        } else {
            System.out.println("\nara ara ara");
        }

    }
}
