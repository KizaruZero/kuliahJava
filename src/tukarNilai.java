public class tukarNilai {
    public static void main(String[] args) {
        int A = 50;
        int B = 21;
        System.out.println("Sebelum pertukaran:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        // Menukar nilai variabel A dan B menggunakan variabel sementara
        int temp = A;
        A = B;
        B = temp;
        System.out.println("Setelah pertukaran:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}