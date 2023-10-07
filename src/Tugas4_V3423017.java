import java.util.Scanner;

public class Tugas4_V3423017 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        var nama = "ARDYA PUSAKA";
        var nim = "V3423017";
        var kelas = "TEKNIK INFORMATIKA A";
        System.out.println("NAMA = "+nama);
        System.out.println("NIM = "+nim);
        System.out.println("KELAS = "+kelas);
        System.out.println("1.OPERATOR MATEMATIKA.");
        int value1 = 100;
        int value2 = 25;
        System.out.println(value1 + value2);
        System.out.println(value1 - value2);
        System.out.println(value1 * value2);
        System.out.println(value1 / value2);
        System.out.println(value1 % value2);
        System.out.println("2.OPERATOR PERBANDINGAN.");
        int a = 250;
        int b = 300;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println("3.OPERATOR LOGIKA.");
        var nilaiUjian = 85;
        var nilaiAbsensi = 90;
        var lulus = nilaiUjian >=80 && nilaiAbsensi >=80;
        System.out.println("Status kelulusanmu = "+lulus);
        var nilaiUjian1 = 70;
        var nilaiAbsensi1 = 90;
        var lulus1 = nilaiUjian1 >=80 || nilaiAbsensi1>=80;
        System.out.println("Status kelulusanmu = "+lulus1);
        System.out.println("4.OPERATOR ASSIGNMENT.");
        int c = 12;
        c+=3;
        System.out.println(c);
        int d = 15;
        d-=10;
        System.out.println(d);
        int e = 20;
        e/=10;
        System.out.println(e);
        int f = 10;
        f*=5;
        System.out.println(f);
        int g = 75;
        g%=10;
        System.out.println(g);
        System.out.print("Masukan Nama Kamu = ");
        String namaKamu = userInput.next();
        System.out.println("Hallo "+namaKamu+ " Terima kasih sudah membaca programku,Semoga harimu menyenangkan :)" );

    }
}
