public class Day36 {
        public static void main(String[] args) {
            int nilai = 90;

            if (nilai >= 75) { // if pertama
                System.out.println("Lulus");

                if (nilai >= 85) { // if di dalam if
                    System.out.println("Nilai kamu sangat baik");
                } else {
                    System.out.println("Nilai kamu cukup");
                }

            } else {
                System.out.println("Tidak lulus");
            }
        }
    }
