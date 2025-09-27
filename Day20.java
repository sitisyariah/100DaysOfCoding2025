public class Day20.java {
    public static void main(String[] args) {
        double pecahan = 45.67;
        int angka = 10;
        boolean status = true;

        // Cara 1: Menggunakan String.valueOf()
        String strPecahan = String.valueOf(pecahan);
        String strAngka = String.valueOf(angka);
        String strStatus = String.valueOf(status);

        // Cetak hasil
        System.out.println("String dari double: " + strPecahan);
        System.out.println("String dari int   : " + strAngka);
        System.out.println("String dari boolean: " + strStatus);
    }
}
