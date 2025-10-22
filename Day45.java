import java.util.Scanner;

public class swiceCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==Daftar menu minuman yang tersedia==");
        System.out.println("1. es teh");
        System.out.println("2. jus jeruk");
        System.out.println("3. vanila");
        System.out.println("4. taro");
        System.out.println("5. boba");
        System.out.println("6. jus alpukad");
        System.out.println("7. jus buah naga");
        System.out.print("pilih menu (1-7)");

        System.out.print("pilih menu : ");
        int pilih = sc.nextInt();

        switch (pilih){
            case 1:
                System.out.println("anda memilih minuman es teh");
                break;
            case 2:
                System.out.println("anda memilih minuman jus jeruk");
                break;
            case 3:
                System.out.println("anda memilih minuman vanila");
                break;
            case 4:
                System.out.println("anda memilih minuman taro");
                break;
            case 5:
                System.out.println("anda memilih minuman boba");
                break;
            case 6:
                System.out.println("anda memilih minuman jus alpukad");
                break;
            case 7:
                System.out.println("anda memilih minumanjus buah naga");
                break;
            default:
                System.out.println("menu yang anda pilih tidak tersedia");
                break;
        }
        System.out.println("...selamat menikmati....");
    }
}
