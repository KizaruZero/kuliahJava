import java.util.Scanner;

public class diantaraInp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int angka1,angka2;
        System.out.print("Masukan Angka Pertama = ");
        angka1 = userInput.nextInt();
        System.out.print("Masukan Angka Kedua = ");
        angka2 = userInput.nextInt();
        while (angka1 <= angka2) {
            System.out.println("angka "+angka1);
            angka1++;
        }
        while (angka1 >= angka2) {
            System.out.println("angka "+angka1);
            angka1--;
        }
    }
}
