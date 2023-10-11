import java.util.Scanner;

public class menentukanGG {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int nilai;
        System.out.println("MENENTUKAN SUATU BILANGAN APAKAH GANJIL/GENAP");
        System.out.print("Masukan Nilai = ");
        nilai = userInput.nextInt();
        if (nilai % 2 == 0) {
            System.out.println("Nilai tersebut adalah Genap");
        } else if (nilai % 2 == 1) {
            System.out.println("Nilai tersebut adalah Ganjil");
        } else {
            System.out.println("Nilai Negatif");
        }
    }
}
