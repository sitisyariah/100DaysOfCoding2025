import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("masukkan batas bawah: ");
        int bawah = sc.nextInt();
        System.out.println("masukkan batas atas: ");
        int atas = sc.nextInt();
        System.out.println("masukkan angka : ");
        int angka = sc.nextInt();
      
        if(angka > bawah && angka < atas){
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }
    }
}
