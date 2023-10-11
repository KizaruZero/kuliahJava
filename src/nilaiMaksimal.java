import java.util.Scanner;

public class nilaiMaksimal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int nilai1, nilai2, nilai3, maksimal;
        System.out.println("MENENTUKAN NILAI MAKSIMAL DARI 3 BILANGAN INTEGER");
        System.out.print("Masukan nilai 1 =");
        nilai1 = userInput.nextInt();
        System.out.print("Masukan nilai 2 =");
        nilai2 = userInput.nextInt();
        System.out.print("Masukan nilai 3 =");
        nilai3 = userInput.nextInt();
        if (nilai1 >= nilai2 && nilai1 >= nilai3) {
            maksimal = nilai1;
        } else if (nilai2 >= nilai1 && nilai2 >= nilai3) {
            maksimal = nilai2;
        } else {
            maksimal = nilai3;
        }
        System.out.println("Nilai Maksimal dari 3 Integer tersebut adalah = " + maksimal);
    }
}
