public class Day19.java {
    public static void main(String[] args) {
        double angkaDouble = 99.99;
        int angkaInt = (int) angkaDouble;   // konversi manual/paksa dari double ke int
        byte angkaByte = (byte) angkaInt;   // konversi manual/paksa dari int ke byte

        System.out.println("Double : " + angkaDouble);
        System.out.println("Int    : " + angkaInt);   // pecahan (.99) hilang
        System.out.println("Byte   : " + angkaByte);  // jika lebih dari 127 akan overflow
    }
}
