import java.util.Scanner;

public class ascendingData {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int temp, data1, data2;
        System.out.print("Masukan Data 1 =");
        data1 = userInput.nextInt();
        System.out.print("Masukan Data 2 =");
        data2 = userInput.nextInt();
        if (data1 > data2) {
            temp = data1;
            data1 = data2;
            data2 = temp;
        }
        System.out.println("Urutan data dari yang terkecil =" + data1 + "," + data2);
    }
}
