public class Day21.java {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);

        // Menggunakan penjumlahan dan pengurangan 
        a = a + b;  // a = 15
        b = a - b;  // b = 5
        a = a - b;  // a = 10
        System.out.println("Setelah ditukar: a = " + a + ", b = " + b);
    }
}
