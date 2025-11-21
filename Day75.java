import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suatu kalimat: ");
        String teks = input.nextLine();

 System.out.println("panjang teks: " + teks.length());
        System.out.println("huruf besar: " + teks.toUpperCase());
        System.out.println("huruf kecil: " + teks.toLowerCase());
    }
}
