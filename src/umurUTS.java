import java.util.Scanner;

public class umurUTS {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int tanggalLahir, bulanLahir, tahunLahir, tanggalSekarang, bulanSekarang, tahunSekarang,tanggal, bulan, tahun;
        System.out.print("Masukan Tanggal Lahir (1-30) = ");
        tanggalLahir = userInput.nextInt();
        System.out.print("Masukan Bulan Lahir (1-12) = ");
        bulanLahir = userInput.nextInt();
        System.out.print("Masukan Tahun Lahir = ");
        tahunLahir = userInput.nextInt();
        System.out.print("Masukan Tanggal Sekarang (1-30) = ");
        tanggalSekarang = userInput.nextInt();
        System.out.print("Masukan Bulan Sekarang (1-12) = ");
        bulanSekarang = userInput.nextInt();
        System.out.print("Masukan Tahun Sekarang = ");
        tahunSekarang = userInput.nextInt();
        tanggal = tanggalSekarang - tanggalLahir;
        bulan = bulanSekarang - bulanLahir;
        tahun = tahunSekarang - tahunLahir;
        if (tanggal < 0) {
            tanggal += 30;
            bulan--;
        }
        if (bulan < 0) {
            bulan += 12;
            tahun--;
        }
        System.out.println("Umur Kamu = " + tahun + " tahun " + bulan + " bulan " + tanggal + " hari ");
    }
}
