import java.util.Scanner;
public class HorizontalStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");   
        }
        System.out.println();         
    }
}
