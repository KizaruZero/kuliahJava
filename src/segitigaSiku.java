import java.util.Scanner;

public class segitigaSiku {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("PROGRAM MENCARI SISI MIRING SEGITIGA SIKU-SIKU");
        double tinggi, alas, sisiMiring;
        var nama = "ARDYA PUSAKA";
        var nim = "V3423017";
        var kelas = "TEKNIK INFORMATIKA A";
        System.out.println("NAMA = "+nama);
        System.out.println("NIM = "+nim);
        System.out.println("KELAS = "+kelas);
        System.out.print("Masukan Tinggi = ");
        tinggi = userInput.nextDouble();
        System.out.print("Masukan Alas = ");
        alas = userInput.nextDouble();
        sisiMiring = Math.sqrt(Math.pow(tinggi,2)+Math.pow(alas,2));
        System.out.println("Sisi Miring = " + sisiMiring);
        System.out.printf("Sisi Miring :%.2f %n", sisiMiring);
    }
}
