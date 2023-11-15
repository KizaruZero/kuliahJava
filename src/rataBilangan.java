import java.util.Scanner;

public class rataBilangan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double jmlAngka,user , input = 0, total = 0;
        System.out.print("Mau berapa angka yang dihitung? = ");
        jmlAngka = userInput.nextDouble();
        do {
            System.out.print("Masukan angka = ");
            user = userInput.nextDouble();
            total += user;
            input++;
        } while (input<jmlAngka);
        System.out.println("Hasil Rata-Rata = " + total/jmlAngka);
    }
}
