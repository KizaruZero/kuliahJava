import java.util.Scanner;

public class tukarNilai {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int A, B;
        System.out.println("Mebuat program pertukaran nilai");
        System.out.print("Masukan nilai pertama = ");
        A = userInput.nextInt();
        System.out.print("Masukan nilai kedua = ");
        B = userInput.nextInt();
        System.out.println("Sebelum pertukaran:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        // Menukar nilai variabel A dan B menggunakan variabel sementara
        int temp = A;
        A = B;
        B = temp;
        System.out.println("Setelah pertukaran:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}