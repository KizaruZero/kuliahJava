import java.util.Scanner;

public class aritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan nilai awal (a), selisih (b), dan jumlah suku (n)
        System.out.print("Masukkan nilai awal (a): ");
        int a = scanner.nextInt();

        System.out.print("Masukkan selisih (b): ");
        int b = scanner.nextInt();

        System.out.print("Masukkan jumlah suku (n): ");
        int n = scanner.nextInt();

        // Menghitung penjumlahan deret aritmatika
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int term = a + (i * b);
            sum += term;
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Penjumlahan deret aritmatika: " + sum);

        scanner.close();
    }
}
