import java.util.Scanner;

public class lingkaran {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double jari, luas, keliling;
        final double phi = 3.14;
        var nama = "ARDYA PUSAKA";
        var nim = "V3423017";
        var kelas = "TEKNIK INFORMATIKA A";
        System.out.println("NAMA = "+nama);
        System.out.println("NIM = "+nim);
        System.out.println("KELAS = "+kelas);
        System.out.println("PROGRAM LUAS DAN KELILING LINGKARAN");
        System.out.print("Masukan Jari-jari = ");
        jari = userInput.nextDouble();
        luas = phi * Math.pow(jari,2);
        System.out.println("Luas Lingkaran = " + luas);
        System.out.printf("Luas Lingkaran :%.2f %n", luas);
        keliling = 2*phi*jari;
        System.out.println("Keliling = " + keliling);
        System.out.printf("Keliling :%.2f %n", keliling);
    }
}
