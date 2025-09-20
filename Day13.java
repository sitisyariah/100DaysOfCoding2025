import java.util.*;
public class Day13.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi
        String nama;
        final String nim;
        String ProgramStudy;
        String alamat;
        double tinggiBadan;
        float bb;
        byte usia;
        int ukt;
        char golonganDarah;
        boolean keaktifanMahasiswa;
        long jarakrumah;
        short sks;
        
        //inisialisasi
        nama = "lestari";
        nim = "D012345";
        ProgramStudy = "informatika";
        alamat = "majene";
        tinggiBadan = 149.7;
        bb = 40.6f;
        usia = 21;
        ukt = 50000000;
        golonganDarah = 'Z';
        keaktifanMahasiswa = false;
        jarakrumah = 13;
        sks = 20;
        
        System.out.println("nama                :"+ nama);
        System.out.println("nim                 :"+ nim);
        System.out.println("programStudy        :"+ ProgramStudy);
        System.out.println("alamat              :"+ alamat);
        System.out.println("tinggiBadan         :"+ tinggiBadan +"cm");
        System.out.println("bb                  :"+ bb + "kg");
        System.out.println("usia                :"+ usia);
        System.out.println("ukt                 :"+ ukt);
        System.out.println("golonganDarah       :"+ golonganDarah);
        System.out.println("keaktifanMahasiswa  :"+ keaktifanMahasiswa);
        System.out.println("jarakrumahkekampus  :"+ jarakrumah + "km");
        System.out.println("jumlah sks          :"+ sks);

        System.out.print("nama    :   ");
        nama = sc.nextLine();
        System.out.print("alamat : ");
        alamat = sc.nextLine();
        System.out.print("tinggiBadan  :");
        tinggiBadan = sc.nextDouble();
        System.out.print("golonganDarah   :");
        golonganDarah = sc.next().charAt(0);
        System.out.print("jarakrumahkekampus  :");
        jarakrumah = sc.nextInt();


        System.out.println("\n===setelah di update==\n"+
                "\nnama               :" + nama +
                "\nnim                :" + nim +
                "\nprogramStudy       :" + ProgramStudy +
                "\nalamat             :" +alamat +
                "\ntinggiBadan        :" +tinggiBadan +
                "\nbb                 :" +bb  +
                "\nusia               :" +usia +
                "\n ukt               :" +ukt +
                "\ngolonganDara       :" +golonganDarah +
                "\nkeaktifanMahasiswa :" +keaktifanMahasiswa +
                "\njarakRumahkekampus :" +jarakrumah +
                "\njumlahSks          :" +sks);



        }
    }
