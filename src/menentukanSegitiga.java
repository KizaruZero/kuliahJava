import java.util.Scanner;

public class menentukanSegitiga {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double sisi1, sisi2, sisi3;
        System.out.print("Masukan Panjang Sisi 1 = ");
        sisi1 = userInput.nextDouble();
        System.out.print("Masukan Panjang Sisi 2 = ");
        sisi2 = userInput.nextDouble();
        System.out.print("Masukan Panjang Sisi 3 = ");
        sisi3 = userInput.nextDouble();

        //Cek apakah nilai yang dimasukan adalah sebuah segitiga
        if (cekSegitiga(sisi1, sisi2, sisi3)) {
            //Mengecek Tipe Segitiga
            if (sisi1 == sisi2 && sisi2 == sisi3) {
                System.out.println("Ini adalah Segitiga Sama Sisi");
            } else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3) {
                System.out.println("Ini adalah Segitiga Sama Kaki");
            } else if (cekSikuSiku(sisi1, sisi2, sisi3)) {
                System.out.println("Ini adalah Segitiga Siku Siku");
            } else {
                System.out.println("Ini adalah Segitiga Sembarang");
            }
        } else {
            System.out.println("Ini Bukanlah Segitiga");
        }

    }

    //Function/Mehtod untuk mengecek apakah yang di inputkan tersebut merupakan sebuah segitiga
    private static boolean cekSegitiga(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }
    // Untuk Mengecek apakah segitiga siku siku
    private static boolean cekSikuSiku(double a, double b, double c) {
        return (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a);
    }
}
