import java.util.Scanner;
public class Day67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.oeut.print("Masukkan jumlah bintang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");   
        }
        System.out.println();         
    }
}
