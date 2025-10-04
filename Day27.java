import java.util.Scanner;

public class Day27.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("nilai awal a: ");
        int a = sc.nextInt();
        System.out.print("nilai awal b: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("setelah ditukar : " + a);
        System.out.println("setelah ditukar : " + b);


    }
}
