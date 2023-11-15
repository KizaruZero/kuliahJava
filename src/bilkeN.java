import java.util.Scanner;

public class bilkeN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double n;
        int y = 1;
        System.out.print("Masukan angka ke N = ");
        n = userInput.nextDouble();
        int hasil = 0;
        do {
            System.out.print(y);
            hasil += y;
            if (y < n) {
                System.out.print("+");
            } else {
                System.out.print("= " + hasil);
            }
            y++;
        } while (y <= n);
    }
}
