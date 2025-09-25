public class Day18.java {
    public static void main(String[] args) {

        byte  angkabyte    = 10;
        short angkashort   = angkabyte;    //otomatis pindah dari byte ke short
        int angkaint       = angkashort;   //otomatis pindah dari short ke int
        long angkalong     = angkaint;     //otomatis pindah dari int ke long
        float angkafloat   = angkalong;    //otomatis pindah dari long ke float
        double angkadouble = angkafloat;   //otomatis pindah dari float ke double

        System.out.println("nilai byte   : " +angkabyte);
        System.out.println("nilai short  : " +angkashort);
        System.out.println("nilai int    : " +angkaint);
        System.out.println("nilai long   : " +angkalong);
        System.out.println("nilai float  : " +angkafloat);
        System.out.println("nilai double : " +angkadouble);
    }
}
