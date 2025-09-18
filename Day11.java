import java.util.Scanner;
public class Day11.java {
    public static void main(String[] args) {
           // Membuat objek scanner
        Scanner input = new Scanner(System.in);

        //  input teks (String)
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        //input bilangan bulat
        System.out.print("masukkan nim: ");
        byte nim = input.nextByte();

        //input karakter
        System.out.print("kelas: ");
        char kelas = input.next().charAt(0);

        // input angka (int)
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        //input bilangan bulat
        System.out.print(" nomor baju: ");
        short nosepatu = input.nextShort();

        //input bilangan bulat
        System.out.print("jarak ke kost: ");
        long jarakkekost = input.nextLong();

        // input angka pecahan (double)
        System.out.println("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

        // input bilangan desimal
        System.out.print("bb: ");
        float bb = input.nextFloat();

        // input logika (true/false)
        System.out.println("saya canti: ");
        boolean sayacantik = input.hasNextBoolean();

        // Menampilkan kembali hasil input
        System.out.println("\nHalo ");
    }
}
