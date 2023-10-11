import java.util.Scanner;

public class diskonBelanja {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int totalBelanja, totalDiskon, totalBayar;
        System.out.println("Membuat Program untuk menentukan total bayar");
        System.out.print("Masukan total belanja = ");
        totalBelanja = userInput.nextInt();
        if (totalBelanja >= 100000) {
            totalDiskon = totalBelanja*10/100;
            System.out.println("Total Diskon =" + totalDiskon);
            totalBayar = totalBelanja-totalDiskon;
            System.out.println("Total bayar = " + totalBayar);
        } else if (totalBelanja >=50000) {
            totalDiskon = totalBelanja*5/100;
            System.out.println("Total Diskon =" + totalDiskon);
            totalBayar = totalBelanja-totalDiskon;
            System.out.println("Total bayar = " + totalBayar);
        } else {
            System.out.println("Total bayar = " + totalBelanja);
        }
    }
}
