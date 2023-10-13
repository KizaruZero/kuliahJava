import java.util.Scanner;

public class golGaji {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int gaji, gol1, gol2, gol3;
        System.out.println("MENENTUKAN GAJI POKOK");
        System.out.print("Masukan Golongan Gaji (1,2,3) = ");
        gaji = userInput.nextInt();
        gol1 = 1000000;
        gol2 = 2000000;
        gol3 = 3000000*98/100;
        if (gaji == 1) {
            System.out.println("GAJI POKOK ANDA ADALAH = " + gol1);
        } else if (gaji == 2) {
            System.out.println("GAJI POKOK ANDA ADALAH = " + gol2);
        } else if (gaji == 3) {
            System.out.println("GAJI POKOK ANDA ADALAH = " +gol3);
        } else {
            System.out.println("MAAF INPUTAN SALAH");
        }
    }
}
