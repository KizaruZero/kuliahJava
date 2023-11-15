import java.util.Scanner;

public class perkalianX {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input, n, x = 0, total = 1;
        System.out.print("Masukan Bilangan ke N = ");
        n = userInput.nextInt();
        do {
            System.out.print("Masukan angka = ");
            input = userInput.nextInt();
            total *= input;
            x++;
        } while (x < n);
        System.out.println("Hasil = " + total);
    }
}
