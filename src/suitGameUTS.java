import java.util.Random;
import java.util.Scanner;

public class suitGameUTS {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String pilihanPlayer, pilihanBot;
        System.out.print("Masukan Pilihan Anda (Gajah,Semut,Orang) = ");
        pilihanPlayer = userInput.nextLine();
        String[] array = {"Gajah", "Semut", "Orang"};
        Random acak = new Random();
        int ambilAcak = acak.nextInt(array.length);
        pilihanBot = array[ambilAcak];
        System.out.println("Permainan = " + "Pilihan Kamu : " + pilihanPlayer + " VS " + "Pilihan Bot : " + pilihanBot);
        if (pilihanPlayer.equals(pilihanBot)) {
            System.out.println("Hasil : Seri");
        } else if (pilihanPlayer.equals("Semut") && pilihanBot.equals("Gajah") ||
                   pilihanPlayer.equals("Orang") && pilihanBot.equals("Semut") ||
                   pilihanPlayer.equals("Gajah") && pilihanBot.equals("Orang")) {
            System.out.println("Hasil : Selamat Anda Menang!");
        } else if (pilihanPlayer.equals("Semut") && pilihanBot.equals("Orang") ||
                   pilihanPlayer.equals("Orang") && pilihanBot.equals("Gajah") ||
                   pilihanPlayer.equals("Gajah") && pilihanBot.equals("Semut")) {
            System.out.println("Hasil : Anda Kalah!");
        } else {
            System.out.println("Input Tidak Valid");
        }
    }
}

