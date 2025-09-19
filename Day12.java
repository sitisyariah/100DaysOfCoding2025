import java.util.Scanner;
public class Day12.java {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        System.out.print("nama : ");
        String nama = sc.nextLine();

        System.out.print("umur : ");
        int umur = sc.nextInt();
        sc.nextLine();

        System.out.print("alamat : ");
        String alamat = sc.nextLine();

        System.out.print("bb : ");
        double bb = sc.nextDouble();

        System.out.print("tinggi badan  : " );
        double tinggiBadan = sc.nextDouble();
        sc.nextLine();

        System.out.print("hobi : ");
        String hobi = sc.nextLine();

        System.out.println("===BIODATA SAYA===");
        System.out.println("nama         : " + nama);
        System.out.println("umur         : " + umur + "thn");
        System.out.println("alamat       : " + alamat);
        System.out.println("bb           : " + bb + "kg");
        System.out.println("tinggi badan : " + tinggiBadan + "cm" );
        System.out.println("hobi         : " + hobi);
        }
    }
