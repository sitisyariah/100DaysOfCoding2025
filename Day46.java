import java.util.Scanner;

public class eva4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jam mulai pengerjaan : ");
        int s = sc.nextInt();
        System.out.print("masukkan lama pengerjaan : ");
        int l = sc.nextInt();

        int TotaljamTidur = (s+l) % 24;
        int waktuTidur = 9 - TotaljamTidur;
        System.out.println(" keluaran " + waktuTidur + " jam " );
    }
}
