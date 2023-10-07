import java.util.Scanner;

public class rataSks {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double sksAlgo, sksMtk, nilaiMtk, nilaiAlgo, totalSks, rataRata;
        sksAlgo = 2;
        sksMtk = 3;
        totalSks = sksAlgo+sksMtk;
        System.out.println("Menghitung Rata-Rata Nilai");
        System.out.print("Masukan Nilai Algo = ");
        nilaiAlgo = userInput.nextDouble();
        System.out.print("Masukan Nilai Mtk = ");
        nilaiMtk = userInput.nextDouble();
        rataRata = ((nilaiAlgo * sksAlgo) + (nilaiMtk * sksMtk)) / totalSks;
        System.out.println("Rata-rata nilainya adalah = " + rataRata);
    }
}
