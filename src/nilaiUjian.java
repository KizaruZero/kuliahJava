import java.util.Scanner;

public class nilaiUjian {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int nilaiMhsw;
        System.out.println("MENENTUKAN KELULUSAN MAHASISWA");
        System.out.print("Masukan Nilai Mahasiswa = ");
        nilaiMhsw = userInput.nextInt();
        if (nilaiMhsw >= 80 && nilaiMhsw <= 100) {
            System.out.println("SANGAT BAIK");
        } else if (nilaiMhsw >= 70 && nilaiMhsw <= 79) {
            System.out.println("BAIK");
        } else if (nilaiMhsw >= 60 && nilaiMhsw <= 69) {
            System.out.println("CUKUP");
        } else if (nilaiMhsw >=0 && nilaiMhsw <=59) {
            System.out.println("TIDAK LULUS");
        } else {

        }
    }
}
