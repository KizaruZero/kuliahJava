import java.util.Scanner;

public class persamaanKuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();

        // Menghitung diskriminan
        double diskriminan = b * b - 4 * a * c;
        System.out.println("Nilai Diskriminannya adalah = " +diskriminan);

        // Menentukan tipe akar
        if (diskriminan > 0) {
            System.out.println("Akar dari persamaan kuadrat adalah nyata dan berbeda.");
        } else if (diskriminan == 0) {
            System.out.println("Akar dari persamaan kuadrat adalah nyata dan sama.");
        } else {
            System.out.println("Akar dari persamaan kuadrat adalah khayal.");
        }

        // Menghitung dan menampilkan nilai akar jika bukan akar khayal
        if (diskriminan >= 0) {
            double akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Akar pertama: " + akar1);
            System.out.println("Akar kedua: " + akar2);
        }

        // Menentukan sifat definiteness
        if (a > 0) {
            System.out.println("Persamaan kuadrat ini definit positif.");
        } else if (a < 0) {
            System.out.println("Persamaan kuadrat ini definit negatif.");
        } else {
            System.out.println("Koefisien a tidak boleh nol untuk persamaan kuadrat.");
        }
    }
}
