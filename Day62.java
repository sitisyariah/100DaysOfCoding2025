import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        int jumlah = 0;

        System.out.print("Proses: ");
        for (int i = 1; i <= N; i++) {
            jumlah += i;
          
            if (i < N) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }

        System.out.println(jumlah);
    }
}
