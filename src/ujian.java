import java.util.Scanner;

public class ujian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam mulai: ");
        int jamMulai = scanner.nextInt();
        System.out.print("Masukkan menit mulai: ");
        int menitMulai = scanner.nextInt();
        System.out.print("Masukkan detik mulai: ");
        int detikMulai = scanner.nextInt();

        System.out.print("Masukkan jam akhir: ");
        int jamAkhir = scanner.nextInt();
        System.out.print("Masukkan menit akhir: ");
        int menitAkhir = scanner.nextInt();
        System.out.print("Masukkan detik akhir: ");
        int detikAkhir = scanner.nextInt();

        int totalDetikMulai = jamMulai * 3600 + menitMulai * 60 + detikMulai;
        int totalDetikAkhir = jamAkhir * 3600 + menitAkhir * 60 + detikAkhir;
        int durasiDetik = totalDetikAkhir - totalDetikMulai;

        int jamDurasi = durasiDetik / 3600;
        int sisaDetik = durasiDetik % 3600;
        int menitDurasi = sisaDetik / 60;
        int detikDurasi = sisaDetik % 60;

        System.out.println("Durasi ujian adalah: " + jamDurasi + " jam, " + menitDurasi + " menit, " + detikDurasi + " detik.");
    }
}

