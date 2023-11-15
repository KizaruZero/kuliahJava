import java.util.Scanner;

public class konfRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int loop = 0;
        while (true) {
            System.out.print("Masukan angka yang ingin dihitung = ");
            int input = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Masih mau lanjut menghitung ? (ya/tidak)");
            String jawab = scanner.nextLine();
            if (jawab.equalsIgnoreCase("ya")) {
                total += input;
                loop ++;
            } else {
                break;
            }
        }
        if (loop > 0) {
            double hasil = (double) total / loop;
            System.out.println("Rata-Rata = " + hasil);
        } else {
            System.out.println("Tidak ada input angka yang valid");
        }
    }
}
